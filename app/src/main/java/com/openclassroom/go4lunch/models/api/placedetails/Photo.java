package com.openclassroom.go4lunch.models.api.placedetails;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Photo implements Serializable {

    @SerializedName("height")
    private Long mHeight;
    @SerializedName("html_attributions")
    private List<String> mHtmlAttributions;
    @SerializedName("photo_reference")
    private String mPhotoReference;
    @SerializedName("width")
    private Long mWidth;

    public Long getHeight() {
        return mHeight;
    }

    public void setHeight(Long height) {
        mHeight = height;
    }

    public List<String> getHtmlAttributions() {
        return mHtmlAttributions;
    }

    public void setHtmlAttributions(List<String> htmlAttributions) {
        mHtmlAttributions = htmlAttributions;
    }

    public String getPhotoReference() {
        return mPhotoReference;
    }

    public void setPhotoReference(String photoReference) {
        mPhotoReference = photoReference;
    }

    public Long getWidth() {
        return mWidth;
    }

    public void setWidth(Long width) {
        mWidth = width;
    }

}
