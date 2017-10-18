package com.example.android.punetouristapp;

import android.content.Context;

import java.util.List;

/**
 * Created by UFO_24 on 09-10-2017.
 */

public class InitEvents {

    public static void initEvents(Context context, List<Events> list) {

        Location event1Loc = new Location(context.getString(R.string.event1_location),
                context.getString(R.string.event1_contact));
        String event1Name = context.getString(R.string.event1_name);
        String event1Desc = context.getString(R.string.event1_desc);
        String event1Timings = context.getString(R.string.event1_timings);
        int event1ImgRes = R.drawable.event_scuba;
        list.add(new Events(event1ImgRes, event1Name, event1Desc, event1Loc, event1Timings));

        Location event2Loc = new Location(context.getString(R.string.event2_location),
                context.getString(R.string.event2_contact));
        String event2Name = context.getString(R.string.event2_name);
        String event2Desc = context.getString(R.string.event2_desc);
        String event2Timings = context.getString(R.string.event2_timings);
        int event2ImgRes = R.drawable.event_circus;
        list.add(new Events(event2ImgRes, event2Name, event2Desc, event2Loc, event2Timings));

        Location event3Loc = new Location(context.getString(R.string.event3_location),
                context.getString(R.string.event3_contact));
        String event3Name = context.getString(R.string.event3_name);
        String event3Desc = context.getString(R.string.event3_desc);
        String event3Timings = context.getString(R.string.event3_timings);
        int event3ImgRes = R.drawable.event_android;
        list.add(new Events(event3ImgRes, event3Name, event3Desc, event3Loc, event3Timings));

        Location event4Loc = new Location(context.getString(R.string.event4_location),
                context.getString(R.string.event4_contact));
        String event4Name = context.getString(R.string.event4_name);
        String event4Desc = context.getString(R.string.event4_desc);
        String event4Timings = context.getString(R.string.event4_timings);
        int event4ImgRes = R.drawable.event_muical;
        list.add(new Events(event4ImgRes, event4Name, event4Desc, event4Loc, event4Timings));

        Location event5Loc = new Location(context.getString(R.string.event5_location),
                context.getString(R.string.event5_contact));
        String event5Name = context.getString(R.string.event5_name);
        String event5Desc = context.getString(R.string.event5_desc);
        String event5Timings = context.getString(R.string.event5_timings);
        int event5ImgRes = R.drawable.event_camping;
        list.add(new Events(event5ImgRes, event5Name, event5Desc, event5Loc, event5Timings));

    }
}
