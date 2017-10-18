package com.example.android.punetouristapp;

/**
 * Created by UFO_24 on 08-10-2017.
 */

public class Location {


    private String m_address;
    private String m_contact;

    public Location(String address, String contact) {

        m_address = address;
        m_contact = contact;
    }

    public String GetAddress() {
        return m_address;
    }

    public String GetContact() {
        return m_contact;
    }
}
