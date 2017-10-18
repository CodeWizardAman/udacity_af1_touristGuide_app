package com.example.android.punetouristapp;

/**
 * Created by UFO_24 on 10-10-2017.
 */

public class HistoricalPlace {

    private Location m_location;
    private String m_placeName;
    private String m_archStyle;
    private String m_timings;
    private String m_desc;
    private String m_yearBuilt;
    int m_imageId;

    public HistoricalPlace() {
    }

    public HistoricalPlace(String placeName, Location location, String archStyle, String timings, String yearBuilt, String desc, int imageId) {
        this.m_location = location;
        this.m_archStyle = archStyle;
        this.m_desc = desc;
        this.m_placeName = placeName;
        this.m_yearBuilt = yearBuilt;
        this.m_timings = timings;
        this.m_imageId = imageId;
    }

    public Location GetLocation() {
        return m_location;
    }

    public String GetArchStyle() {
        return m_archStyle;
    }

    public String GetDesc() {
        return m_desc;
    }

    public String GetPlaceName() {
        return m_placeName;
    }

    public String GetYearBuilt() {
        return m_yearBuilt;
    }

    public String GetTimings() {
        return m_timings;
    }

    public int GetImageId() {
        return m_imageId;
    }

}
