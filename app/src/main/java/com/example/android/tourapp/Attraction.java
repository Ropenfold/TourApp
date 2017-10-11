package com.example.android.tourapp;

/**
 * Created by Stuart on 08/09/2017.
 */

public class Attraction {

    //string name of attraction
    private String mAttractionName;

    //string name of address
    private String mAddress;

    //Image Resource marker
    private int mImageResourceID;

    //Audio commentary Marker
    private String mAudioDescription = NO_AUDIO_DESCRIPTION_PROVIDED;

    //telephone number
    private String mTelephoneNumber = NO_TELEPHONE_NUMBER_PROVIDED;

    //website address
    private String mWebsiteAddress = NO_WEBSITE_PROVIDED;

    //audio resource ID
    private int mAudioResourceID = NO_AUDIO_PROVIDED;

    //allows for google maps to bring up location of attraction
    private double mLatitude;
    private double mLongtitude;

    private static final int NO_AUDIO_PROVIDED = -1;
    private static final String NO_WEBSITE_PROVIDED = null;
    private static final String NO_TELEPHONE_NUMBER_PROVIDED = null;
    private static final String NO_AUDIO_DESCRIPTION_PROVIDED = null;

    //full constructor when attraction has all items
    public Attraction(String attractionName, String address, String websiteAddress, int imageResourceID, int audioResourceID, String audioDescription, double latitude, double longtitude) {
        this.mAttractionName = attractionName;
        this.mAddress = address;
        this.mImageResourceID = imageResourceID;
        this.mAudioDescription = audioDescription;
        this.mWebsiteAddress = websiteAddress;
        this.mAudioResourceID = audioResourceID;
        this.mLatitude = latitude;
        this.mLongtitude = longtitude;
    }

    //constructor when Attraction has no audio element or website address
    public Attraction(String attractionName, String address, int imageResourceID, double latitude, double longtitude) {
        this.mAttractionName = attractionName;
        this.mAddress = address;
        this.mImageResourceID = imageResourceID;
        this.mLatitude = latitude;
        this.mLongtitude = longtitude;
    }

    //constructor when Attraction has no audio element or no telephone number
    public Attraction(String attractionName, String address, String websiteAddress, int imageResourceID, double latitude, double longtitude) {
        this.mAttractionName = attractionName;
        this.mAddress = address;
        this.mImageResourceID = imageResourceID;
        this.mWebsiteAddress = websiteAddress;
        this.mLatitude = latitude;
        this.mLongtitude = longtitude;
    }

    public String getAttractionName() {
        return mAttractionName;
    }

    public String getAddress() {
        return mAddress;
    }

    public int getImageResourceID() {
        return mImageResourceID;
    }

    public String getAudioDescription() {
        return mAudioDescription;
    }

    public String getWebsiteAddress() {
        return mWebsiteAddress;
    }

    public int getAudioResourceID() {
        return mAudioResourceID;
    }

    public double getLatitude() {
        return mLatitude;
    }

    public double getLongtitude() {
        return mLongtitude;
    }

    // check whether URL is provided or not
    public boolean hasURL() {
        return mWebsiteAddress != NO_WEBSITE_PROVIDED;
    }

    public boolean hasAudioDescription(){
        return mAudioDescription != NO_AUDIO_DESCRIPTION_PROVIDED;
    }
}
