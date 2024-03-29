package com.openclassroom.go4lunch.models.api.nearbysearch;

import com.google.gson.annotations.SerializedName;

public class PlusCode {
    @SerializedName("compound_code")
    private String mCompoundCode;
    @SerializedName("global_code")
    private String mGlobalCode;

    public String getCompoundCode() {
        return mCompoundCode;
    }

    public void setCompoundCode(String compoundCode) {
        mCompoundCode = compoundCode;
    }

    public String getGlobalCode() {
        return mGlobalCode;
    }

    public void setGlobalCode(String globalCode) {
        mGlobalCode = globalCode;
    }
}
