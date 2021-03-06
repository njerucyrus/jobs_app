package com.me.njerucyrus.models;

import com.google.firebase.database.Exclude;

/**
 * Created by njerucyrus on 2/6/18.
 */

public class User {
    private String fullName;
    private String email;
    private String phoneNumber;
    private String userUid;
    private String status;
    private String image;
    private String imageThumbnail;
    private String deviceTokenId;
    private String online;


    public User() {
    }

    public User(String fullName, String email, String phoneNumber, String userUid, String status, String image, String imageThumbnail, String deviceTokenId, String online) {
        this.fullName = fullName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.userUid = userUid;
        this.status = status;
        this.image = image;
        this.imageThumbnail = imageThumbnail;
        this.deviceTokenId = deviceTokenId;
        this.online = online;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageThumbnail() {
        return imageThumbnail;
    }

    public void setImageThumbnail(String imageThumbnail) {
        this.imageThumbnail = imageThumbnail;
    }

    public String getDeviceTokenId() {
        return deviceTokenId;
    }

    public void setDeviceTokenId(String deviceTokenId) {
        this.deviceTokenId = deviceTokenId;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
    }
}