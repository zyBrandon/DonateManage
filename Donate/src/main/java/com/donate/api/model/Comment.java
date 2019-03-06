package com.donate.api.model;

public class Comment {
    private String username;//被评论人
    private String comment_username;//评论人
    private String comment_content;//评论内容
    private String comment_time;//评论时间

    public Comment(){

    }

    public Comment(String username,String comment_username,String comment_content,String comment_time){
        this.username = username;
        this.comment_username = comment_username;
        this.comment_content = comment_content;
        this.comment_time = comment_time;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getComment_username() {
        return comment_username;
    }

    public void setComment_username(String comment_username) {
        this.comment_username = comment_username;
    }

    public String getComment_content() {
        return comment_content;
    }

    public String getComment_time() {
        return comment_time;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public void setComment_time(String comment_time) {
        this.comment_time = comment_time;
    }
}
