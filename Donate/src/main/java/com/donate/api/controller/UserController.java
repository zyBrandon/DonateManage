package com.donate.api.controller;


import com.donate.api.mapper.UserMapper;
import com.donate.api.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Vector;

@RequestMapping("user/")
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    //用户登录
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/userLand",method = RequestMethod.GET)
    public int userLand(@RequestParam String username,@RequestParam String pass){
        int i = userMapper.userLand(username,pass);
        return i;
    }

    //获得用户的信息
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public User getUser(@RequestParam String username){
        User user = userMapper.getUser(username);
        return user;
    }

    //更新用户的信息
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/updateUser",method = RequestMethod.GET)
    public int updateUser(@RequestParam String username,@RequestParam String pass,@RequestParam String name,
                          @RequestParam String sex,@RequestParam String phone_num,@RequestParam String address,@RequestParam String email){
        int i = userMapper.updateUser(username,pass,name,sex,phone_num,address,email);
        return i;
    }

    //发布捐赠信息
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/insertDonation",method = RequestMethod.GET)
    public int insertDonation(@RequestParam String username,@RequestParam String name,@RequestParam String title,@RequestParam String content,@RequestParam String img_url){
        int i = userMapper.insertDonation(username,name,title,content,img_url);
        return i;
    }

    //查看捐赠信息
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/selectDonation",method = RequestMethod.GET)
    public Vector<Donation> selectDonation(){
        Vector<Donation> donations = userMapper.selectDonation();
        return donations;
    }

    //通过username查看捐赠信息
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/selectDonationByUsername",method = RequestMethod.GET)
    public Vector<Donation> selectDonationByUsername(@RequestParam String username){
        Vector<Donation> donations = userMapper.selectDonationByUsername(username);
        return donations;
    }

    //查看本人的所有评论
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/selectCommentByUsername",method = RequestMethod.GET)
    public Vector<Comment> selectCommentByUsername(@RequestParam String username){
        Vector<Comment> comments = userMapper.selectCommentByUsername(username);
        return comments;
    }

    //添加评论
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/insertComment",method = RequestMethod.GET)
    public int insertComment(@RequestParam String username,@RequestParam String comment_username,
                             @RequestParam String comment_content,@RequestParam String comment_time){
        int i = userMapper.insertComment(username,comment_username,comment_content,comment_time);
        return i;
    }

    //点赞他人
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/insertPraise",method = RequestMethod.GET)
    public int insertPraise(@RequestParam String username,@RequestParam String praise_username,@RequestParam String praise_time){
        int i = userMapper.insertPraise(username,praise_username,praise_time);
        return i;
    }

    //查看个人的被点赞数目
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/selectPraise",method = RequestMethod.GET)
    public int selectPraise(@RequestParam String username){
        int i = userMapper.selectPraise(username);
        return i;
    }

    //点击我想要
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/insertReceiver",method = RequestMethod.GET)
    public int insertReceiver(@RequestParam String username,@RequestParam String donate_username,
                              @RequestParam String donate_name,@RequestParam String donate_title){
        int i = userMapper.insertReceiver(username,donate_username,donate_name,donate_title);
        return i;
    }

    //查看所有的我想要
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/selectReceiver",method = RequestMethod.GET)
    public Vector<Receiver> selectReceiver(){
        Vector<Receiver> receivers = userMapper.selectReceiver();
        return receivers;
    }

    //搜索对应的捐赠物
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/searchDonation",method = RequestMethod.GET)
    public Vector<Donation> searchDonation(@RequestParam String name){
        Vector<Donation> donations = userMapper.searchDonation(name);
        return donations;
    }

    //搜索热点捐赠
    @CrossOrigin(origins = {"http://localhost:8080", "null"})
    @RequestMapping(value = "/selectHot",method = RequestMethod.GET)
    public Vector<Hot> selectHot(){
        Vector<Hot> hots = userMapper.selectHot();
        return hots;
    }

}