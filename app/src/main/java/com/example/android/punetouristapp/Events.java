package com.example.android.punetouristapp;

/**
 * Created by UFO_24 on 09-10-2017.
 */

public class Events {

    public Events() {

    }

    private int m_eventImgRes;
    private String m_eventName;
    private String m_eventDesc;
    private Location m_evenLoc;
    private String m_eventTimings;

    public Events(int imageRes, String eventName, String eventDesc, Location evenLoc, String evenTimings) {
        m_eventImgRes = imageRes;
        m_eventName = eventName;
        m_eventDesc = eventDesc;
        m_evenLoc = evenLoc;
        m_eventTimings = evenTimings;
    }

    public int GetEventImgRes() {
        return m_eventImgRes;
    }

    public String GetEventName() {
        return m_eventName;
    }

    public String GetEventDesc() {
        return m_eventDesc;
    }

    public Location GetEventLoc() {
        return m_evenLoc;
    }

    public String GetEventTimings() {
        return m_eventTimings;
    }

}
