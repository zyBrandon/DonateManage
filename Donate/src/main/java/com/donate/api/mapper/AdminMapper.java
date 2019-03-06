package com.donate.api.mapper;

import com.donate.api.model.Donation;
import com.donate.api.model.Receiver;
import com.donate.api.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Vector;

@Mapper
public interface AdminMapper {

    @Select("select count(*) from admin_tbl where username=#{username} and pass=#{pass}")
    int adminLand(@Param("username") String username,@Param("pass") String pass);

    @Insert("insert into user_tbl values(#{username},#{pass},#{name},#{sex},#{phone_num},#{address},#{email})")
    int insertUser(@Param("username") String username, @Param("pass") String pass,@Param("name") String name,@Param("sex") String sex, @Param("phone_num") String phone_num, @Param("address") String address,@Param("email") String email);

    @Select("select * from user_tbl")
    Vector<User> selectUser();

    @Delete("delete from user_tbl where username=#{username}")
    int deleteUser(@Param("username") String username);

    @Select("select * from donation_tbl where post='n'")
    Vector<Donation> selectPostDonation();

    @Update("update donation_tbl set post='y' where username=#{username} and name=#{name} and title=#{title}")
    int updatePostDonation(@Param("username") String username,@Param("name") String name,@Param("title") String title);

    @Select("select * from receiver_tbl")
    Vector<Receiver> selectReceiver();

    @Delete("delete from receiver_tbl where username=#{username} and donate_username=#{donate_username} and donate_name=#{donate_name} and donate_title=#{donate_title}")
    int deleteReceiver(@Param("username") String username,@Param("donate_username") String donate_username,@Param("donate_name") String donate_name,@Param("donate_title") String donate_title);

    @Delete("delete from donation_tbl where username=#{donate_username} and name=#{donate_name} and title=#{donate_title}")
    int deleteDonation(@Param("donate_username") String donate_username,@Param("donate_name") String donate_name,@Param("donate_title") String donate_title);

    @Select("select * from user_tbl where username=#{username}")
    Vector<User> selectUserByUsername(@Param("username") String username);

    @Select("select count(*) from user_tbl")
    int getUserNum();

    @Select("select count(*) from admin_tbl")
    int getAdminNum();

    @Select("select count(*) from donation_tbl")
    int getDonation();

    @Select("select count(*) from receiver_tbl")
    int getReceiver();

    @Select("select comment_time from comment_tbl")
    ArrayList<String> getCommentTime();

    @Insert("insert into hot_tbl values(#{location},#{donation},#{reason},#{hot_time})")
    int insertHot(@Param("location") String location,@Param("donation") String donation,@Param("reason") String reason,@Param("hot_time") String hot_time);
}
