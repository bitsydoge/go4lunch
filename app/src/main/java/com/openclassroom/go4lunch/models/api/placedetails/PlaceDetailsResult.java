package com.openclassroom.go4lunch.models.api.placedetails;

import java.io.Serializable;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class PlaceDetailsResult implements Serializable {

    @SerializedName("name")
    private String mName;
    @SerializedName("formatted_address")
    private String mFormattedAddress;
    @SerializedName("opening_hours")
    private OpeningHours mOpeningHours;
    @SerializedName("photos")
    private List<Photo> mPhotos;
    @SerializedName("rating")
    private Double mRating;
    @SerializedName("formatted_phone_number")
    private String mFormattedPhoneNumber;
    @SerializedName("geometry")
    private Geometry mGeometry;
    @SerializedName("place_id")
    private String mPlaceId;
    @SerializedName("reference")
    private String mReference;
    @SerializedName("vicinity")
    private String mVicinity;
    @SerializedName("website")
    private String mWebsite;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public OpeningHours getOpeningHours() {
        return mOpeningHours;
    }

    public void setOpeningHours(OpeningHours openingHours) {
        mOpeningHours = openingHours;
    }

    public List<Photo> getPhotos() {
        return mPhotos;
    }

    public void setPhotos(List<Photo> photos) {
        mPhotos = photos;
    }

    public Double getRating() {
        return mRating;
    }

    public void setRating(Double rating) {
        mRating = rating;
    }

    public String getVicinity() {
        return mVicinity;
    }

    public void setVicinity(String vicinity) {
        mVicinity = vicinity;
    }

    public String getFormattedPhoneNumber() {
        return mFormattedPhoneNumber;
    }

    public void setFormattedPhoneNumber(String formattedPhoneNumber) {
        mFormattedPhoneNumber = formattedPhoneNumber;
    }

    public Geometry getGeometry() {
        return mGeometry;
    }

    public void setGeometry(Geometry geometry) {
        mGeometry = geometry;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public void setWebsite(String website) {
        mWebsite = website;
    }

    public String getPlaceId() {
        return mPlaceId;
    }

    public void setPlaceId(String placeId) {
        mPlaceId = placeId;
    }

    public String getReference() {
        return mReference;
    }

    public void setReference(String reference) {
        mReference = reference;
    }

    public String getFormattedAddress() {
        return mFormattedAddress;
    }

    public void setFormattedAddress(String formattedAddress) {
        mFormattedAddress = formattedAddress;
    }
}


