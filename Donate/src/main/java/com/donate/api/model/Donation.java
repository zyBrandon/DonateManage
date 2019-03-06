package com.donate.api.model;

public class Donation {
    private String username;//捐赠人的用户名
    private String name;//捐赠物品的名字
    private String title;
    private String content;
    private String img_url;
    private String post;//发布
    private String get;//领取

    public Donation(){

    }

    public Donation(String username,String name,String title,String content,String img_url,String post,String get){
        this.username = username;
        this.name = name;
        this.title = title;
        this.content = content;
        this.img_url = img_url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getImg_url() {
        return img_url;
    }

    public String getGet() {
        return get;
    }


    public String getPost() {
        return post;
    }

    public void setGet(String get) {
        this.get = get;
    }


    public void setPost(String post) {
        this.post = post;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {  this.username = username; }
}