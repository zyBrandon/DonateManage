package com.donate.api.model;

public class Admin {
    private String username;//用户名
    private String pass;//密码

    public Admin(){

    }

    public Admin(String username,String pass){
        this.username = username;
        this.pass = pass;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
