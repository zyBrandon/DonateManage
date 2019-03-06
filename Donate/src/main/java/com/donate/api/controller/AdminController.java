package com.donate.api.controller;

import com.donate.api.mapper.AdminMapper;
import com.donate.api.model.Donation;
import com.donate.api.model.Receiver;
import com.donate.api.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Vector;

@RequestMapping("admin/")
@RestController
public class AdminController {
    @Autowired
    private AdminMapper adminMapper;

    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){
        return "你好周越";
    }

    //管理员登录
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/adminLand",method = RequestMethod.GET)
    public int adminLand(@RequestParam String username, @RequestParam String pass){
        int i = adminMapper.adminLand(username,pass);
        return i;
    }

    //注册用户
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/insertUser",method = RequestMethod.GET)
    public int insertUser(@RequestParam String username,@RequestParam String pass,@RequestParam String name,
                          @RequestParam String sex,@RequestParam String phone_num,@RequestParam String address,@RequestParam String email){
        int i = adminMapper.insertUser(username,pass,name,sex,phone_num,address,email);
        return i;
    }

    //查看所有用户
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/selectUser",method = RequestMethod.GET)
    public Vector<User> selectUser(){
        Vector<User> users = adminMapper.selectUser();
        return users;
    }

    //查询指定用户
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/selectUserByUsername",method = RequestMethod.GET)
    public Vector<User> selectUserByUsername(@RequestParam String username){
        Vector<User> users = adminMapper.selectUserByUsername(username);
        return users;
    }

    //删除用户
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
    public int deleteUser(@RequestParam String username){
        int i = adminMapper.deleteUser(username);
        return i;
    }

    //查询所有未发布的捐赠物
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/selectPostDonation",method = RequestMethod.GET)
    public Vector<Donation> selectPostDonation(){
        Vector<Donation> donations = adminMapper.selectPostDonation();
        return donations;
    }

    //发布捐赠物
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/updatePostDonation",method = RequestMethod.GET)
    public int updatePostDonation(@RequestParam String username,@RequestParam String name,@RequestParam String title){
        int i = adminMapper.updatePostDonation(username,name,title);
        return i;
    }

    //查询用户需要
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/selectReceiver",method = RequestMethod.GET)
    public Vector<Receiver> selectReceiver(){
        Vector<Receiver> receivers = adminMapper.selectReceiver();
        return receivers;
    }

    //捐赠成功
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/deleteReceiver",method = RequestMethod.GET)
    public int deleteReceiver(@RequestParam String username,@RequestParam String donate_username,@RequestParam String donate_name,
                              @RequestParam String donate_title){
        //删除用户需要
        int i = adminMapper.deleteReceiver(username,donate_username,donate_name,donate_title);
        //删除用户捐赠表
        int j = adminMapper.deleteDonation(donate_username,donate_name,donate_title);
        if (i == 1 && j == 1){
            return 1;
        } else {
            return i;
        }

    }

    //获取用户数和管理员数
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/getAdminAndUser",method = RequestMethod.GET)
    public Vector<Integer> getAdminAndUser(){
        int i = adminMapper.getUserNum();
        int j = adminMapper.getAdminNum();
        int k = adminMapper.getDonation();
        int l = adminMapper.getReceiver();
        Vector<Integer> integers= new Vector<Integer>();
        integers.add(i);
        integers.add(j);
        integers.add(k);
        integers.add(l);
        return integers;
    }

    //获取12个月份的评论总数
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/getCommentNum",method = RequestMethod.GET)
    public ArrayList<Integer> getCommentNum(){
        ArrayList<String> comments_time = adminMapper.getCommentTime();
        ArrayList<Integer> comments_num = new ArrayList<>();
        int m1=0,m2=0,m3=0,m4=0,m5=0,m6=0,m7=0,m8=0,m9=0,m10=0,m11=0,m12=0;
        for (int i = 0;i<comments_time.size();i++){
            if (comments_time.get(i).substring(5,7).equals("01")){
                m1++;
            } else if (comments_time.get(i).substring(5,7).equals("02")){
                m2++;
            }else if (comments_time.get(i).substring(5,7).equals("03")){
                m3++;
            }else if (comments_time.get(i).substring(5,7).equals("04")){
                m4++;
            }else if (comments_time.get(i).substring(5,7).equals("05")){
                m5++;
            }else if (comments_time.get(i).substring(5,7).equals("06")){
                m6++;
            }else if (comments_time.get(i).substring(5,7).equals("07")){
                m7++;
            }else if (comments_time.get(i).substring(5,7).equals("08")){
                m8++;
            }else if (comments_time.get(i).substring(5,7).equals("09")){
                m9++;
            }else if (comments_time.get(i).substring(5,7).equals("10")){
                m10++;
            }else if (comments_time.get(i).substring(5,7).equals("11")){
                m11++;
            } else {
                m12++;
            }
        }
        comments_num.add(m1);
        comments_num.add(m2);
        comments_num.add(m3);
        comments_num.add(m4);
        comments_num.add(m5);
        comments_num.add(m6);
        comments_num.add(m7);
        comments_num.add(m8);
        comments_num.add(m9);
        comments_num.add(m10);
        comments_num.add(m11);
        comments_num.add(m12);
        return comments_num;


    }
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/insertHot",method = RequestMethod.GET)
    public int insertHot(@RequestParam String location,@RequestParam String donation,
                         @RequestParam String reason,@RequestParam String hot_time){
        int i = adminMapper.insertHot(location,donation,reason,hot_time);
        return i;
    }
}
