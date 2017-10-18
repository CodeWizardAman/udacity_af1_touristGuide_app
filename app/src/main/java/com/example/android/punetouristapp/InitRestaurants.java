package com.example.android.punetouristapp;

import android.content.Context;

import java.util.List;

/**
 * Created by UFO_24 on 08-10-2017.
 */

public class InitRestaurants {

    public static void initRestaurantList(Context context, List<Restaurants> list){


        Location rest1loc = new Location(context.getString(R.string.rest1_loc),
                context.getString(R.string.rest1_contact));

        String res1Name = context.getString(R.string.rest1_name);
        String res1Desc = context.getString(R.string.rest1_desc);
        int rest1ImgRes = R.drawable.rest_1;

        list.add(new Restaurants(res1Name, rest1loc, res1Desc, rest1ImgRes));

        Location res2loc = new Location(context.getString(R.string.rest2_loc),
                context.getString(R.string.rest2_contact));
        String res2Name = context.getString(R.string.rest2_name);
        String res2Desc = context.getString(R.string.rest2_desc);
        int rest2ImgRes = R.drawable.rest_2;

        list.add(new Restaurants(res2Name, res2loc, res2Desc, rest2ImgRes));

        Location rest3loc = new Location(context.getString(R.string.rest3_loc),
                context.getString(R.string.rest3_contact));
        String res3Name = context.getString(R.string.rest3_name);
        String res3Desc = context.getString(R.string.rest3_desc);
        int rest3ImgRes = R.drawable.rest_3;

        list.add(new Restaurants(res3Name, rest3loc, res3Desc, rest3ImgRes));

        Location rest4loc = new Location(context.getString(R.string.rest4_loc),
                context.getString(R.string.rest4_contact));
        String res4Name = context.getString(R.string.rest4_name);
        String res4Desc = context.getString(R.string.rest4_desc);
        int rest4ImgRes = R.drawable.rest_4;

        list.add(new Restaurants(res4Name, rest1loc,res4Desc, rest4ImgRes));

        Location rest5loc = new Location(context.getString(R.string.rest5_loc),
                context.getString(R.string.rest5_contact));
        String res5Name = context.getString(R.string.rest5_name);
        String res5Desc = context.getString(R.string.rest5_desc);
        int rest5ImgRes = R.drawable.rest_5;

        list.add(new Restaurants(res5Name,rest5loc, res5Desc, rest5ImgRes));

    }
}
