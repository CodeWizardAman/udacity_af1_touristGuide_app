package com.example.android.punetouristapp;

/**
 * Created by UFO_24 on 08-10-2017.
 */

public class AboutCity {

    private int m_imageId;
    private String m_title;
    private String m_description;

    public AboutCity() {
    }

    public AboutCity(int imageId, String title, String description) {
        this.m_imageId = imageId;
        this.m_title = title;
        this.m_description = description;
    }

    public int GetImageId() {
        return this.m_imageId;
    }

    public String GetTitle() {
        return this.m_title;
    }

    public String GetCityDescription() {
        return this.m_description;
    }
}
