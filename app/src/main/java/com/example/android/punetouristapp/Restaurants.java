package com.example.android.punetouristapp;

/**
 * Created by UFO_24 on 08-10-2017.
 */

public class Restaurants {

    private String m_restaurantName;
    private String m_restaurantDesc;
    private Location m_location;
    private int m_imageId;


    public Restaurants(String restaurantName, Location location, String description, int imageId) {

        m_restaurantName = restaurantName;
        m_location = location;
        m_restaurantDesc = description;
        m_imageId = imageId;
    }

    public String GetRestaurantName() {
        return m_restaurantName;
    }

    public Location GetLocation() {
        return m_location;
    }

    public String GetRstaurantDesc() {
        return m_restaurantDesc;
    }

    public int GetImageId() {
        return m_imageId;
    }
}
