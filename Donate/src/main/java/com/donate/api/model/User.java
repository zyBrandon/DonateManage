package com.donate.api.model;

public class User {
    private String username;//用户名
    private String pass;//密码
    private String name;//真实姓名
    private String sex;//性别
    private String phone_num;//电话号码
    private String address;//地址
    private String email;//电子邮箱

    public User(){

    }
    public User(String username,String pass,String name,String sex,String phone_num,String address,String email){
        this.username = username;
        this.pass = pass;
        this.name = name;
        this.sex = sex;
        this.phone_num = phone_num;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }


    public String getAddress() {
        return address;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public String getSex() {
        return sex;
    }

    public String getUsername() {
        return username;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
