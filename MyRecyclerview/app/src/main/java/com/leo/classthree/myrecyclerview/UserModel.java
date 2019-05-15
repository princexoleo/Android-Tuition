package com.leo.classthree.myrecyclerview;

public class UserModel {
    private String username;
    private String user_proImage;
    private  String user_body_image;

    public UserModel() {

    }

    public UserModel(String username, String user_proImage, String user_body_image) {
        this.username = username;
        this.user_proImage = user_proImage;
        this.user_body_image = user_body_image;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUser_proImage() {
        return user_proImage;
    }

    public void setUser_proImage(String user_proImage) {
        this.user_proImage = user_proImage;
    }

    public String getUser_body_image() {
        return user_body_image;
    }

    public void setUser_body_image(String user_body_image) {
        this.user_body_image = user_body_image;
    }
}
