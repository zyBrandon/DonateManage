package com.donate.api.mapper;

import com.donate.api.model.*;
import org.apache.ibatis.annotations.*;

import java.util.Vector;

@Mapper
public interface UserMapper {

    @Select("select count(*) from user_tbl where username=#{username} and pass=#{pass}")
    int userLand(@Param("username") String username, @Param("pass") String pass);

    @Select("select * from user_tbl where username=#{username}")
    User getUser(@Param("username") String username);

    @Update("update user_tbl set pass=#{pass},name=#{name},sex=#{sex},phone_num=#{phone_num},address=#{address},email=#{email} where username=#{username}")
    int updateUser(@Param("username") String username, @Param("pass") String pass,@Param("name") String name,@Param("sex") String sex, @Param("phone_num") String phone_num, @Param("address") String address,@Param("email") String email);

    @Insert("insert into donation_tbl(username,name,title,content,img_url) values(#{username},#{name},#{title},#{content},#{img_url})")
    int insertDonation(@Param("username") String username,@Param("name") String name,@Param("title") String title,@Param("content") String content,@Param("img_url") String img_url);

    @Select("select * from donation_tbl where post='y'")
    Vector<Donation> selectDonation();

    @Select("select * from donation_tbl where username=#{username}")
    Vector<Donation> selectDonationByUsername(@Param("username") String username);

    @Select("select * from comment_tbl where username=#{username}")
    Vector<Comment> selectCommentByUsername(@Param("username") String username);

    @Insert("insert into comment_tbl values(#{username},#{comment_username},#{comment_content},#{comment_time})")
    int insertComment(@Param("username") String username,@Param("comment_username") String comment_username,@Param("comment_content") String comment_content,@Param("comment_time") String comment_time);

    @Insert("insert into praise_tbl values(#{username},#{praise_username},#{praise_time})")
    int insertPraise(@Param("username") String username,@Param("praise_username") String praise_username,@Param("praise_time") String praise_time);

    @Select("select count(*) from praise_tbl where username=#{username}")
    int selectPraise(@Param("username") String username);

    @Insert("insert into receiver_tbl values(#{username},#{donate_username},#{donate_name},#{donate_title})")
    int insertReceiver(@Param("username") String username,@Param("donate_username") String donate_username,@Param("donate_name") String donate_name,@Param("donate_title") String donate_title);

    @Select("select * from receiver_tbl")
    Vector<Receiver> selectReceiver();

    @Select("select * from donation_tbl where name=#{name}")
    Vector<Donation> searchDonation(@Param("name") String name);

    @Select("select * from hot_tbl")
    Vector<Hot> selectHot();
}
