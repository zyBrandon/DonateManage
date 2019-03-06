package com.donate.api.model;

public class Praise {
    private String username;//被点赞人
    private String praise_username;//点赞人
    private String praise_time;//点赞时间

    public Praise(){

    }

    public Praise(String username,String praise_username,String praise_time){
        this.username = username;
        this.praise_username = praise_username;
        this.praise_time = praise_time;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPraise_time() {
        return praise_time;
    }

    public String getPraise_username() {
        return praise_username;
    }

    public void setPraise_time(String praise_time) {
        this.praise_time = praise_time;
    }

    public void setPraise_username(String praise_username) {
        this.praise_username = praise_username;
    }
}
