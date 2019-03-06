package com.donate.api.model;

public class Receiver {
    private String username;//接收者的用户名
    private String donate_username;//捐赠者的用户名
    private String donate_name;//捐赠物品的名字
    private String donate_title;//捐赠物品的标题

    public Receiver(){

    }

    public Receiver(String username,String donate_username,String donate_name,String donate_title){
        this.username = username;
        this.donate_username = donate_username;
        this.donate_name = donate_name;
        this.donate_title = donate_title;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getDonate_name() {
        return donate_name;
    }

    public String getDonate_title() {
        return donate_title;
    }

    public String getDonate_username() {
        return donate_username;
    }

    public void setDonate_name(String donate_name) {
        this.donate_name = donate_name;
    }

    public void setDonate_title(String donate_title) {
        this.donate_title = donate_title;
    }

    public void setDonate_username(String donate_username) {
        this.donate_username = donate_username;
    }
}
