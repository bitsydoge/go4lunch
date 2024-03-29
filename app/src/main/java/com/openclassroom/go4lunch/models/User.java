package com.openclassroom.go4lunch.models;

import java.util.List;

public class User {

    private String mUid;
    private String mDisplayName;
    private List<String> mLikeList;
    private String mAvatarUrl;
    private String mEatingAt;
    private String mEatingAtName;
    private String mEmailAddress;

    public User(String id, String displayName, List<String> likeList, String avatarUrl, String eatingAt, String eatingAtName, String emailAddress) {
        mUid = id;
        mDisplayName = displayName;
        mLikeList = likeList;
        mAvatarUrl = avatarUrl;
        mEatingAt = eatingAt;
        mEatingAtName = eatingAtName;
        mEmailAddress = emailAddress;
    }

    public String getUid() {
        return mUid;
    }

    public void setUid(String uid) {
        this.mUid = uid;
    }

    public String getDisplayName() {
        return mDisplayName;
    }

    public void setDisplayName(String displayName) {
        mDisplayName = displayName;
    }

    public List<String> getLikeList() {
        return mLikeList;
    }

    public void setLikeList(List<String> likeList) {
        mLikeList = likeList;
    }

    public String getPhotoUrl() {
        return mAvatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        mAvatarUrl = avatarUrl;
    }

    public String getEatingAt() {
        return mEatingAt;
    }

    public void setEatingAt(String eatingAt) {
        mEatingAt = eatingAt;
    }

    public String getEatingAtName() {
        return mEatingAtName;
    }

    public void setEatingAtName(String eatingAtName) {
        mEatingAtName = eatingAtName;
    }

    public String getEmail() {
        return mEmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        mEmailAddress = emailAddress;
    }
}
