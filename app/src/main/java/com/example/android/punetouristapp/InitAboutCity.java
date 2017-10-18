package com.example.android.punetouristapp;

import android.content.Context;

import java.util.List;

/**
 * Created by UFO_24 on 08-10-2017.
 */

public class InitAboutCity {

    public static void initAboutCity(Context context, List<AboutCity> list) {

        String aboutCityTitle = context.getString(R.string.about_city_title);
        String aboutCityDesc = context.getString(R.string.about_city_desc);
        int aboutCityImageId = R.drawable.about_city;
        list.add(new AboutCity(aboutCityImageId, aboutCityTitle, aboutCityDesc));

        String aboutClimate = context.getString(R.string.about_climate_title);
        String aboutClimateDesc = context.getString(R.string.about_climate_desc);
        int aboutClimateImageId = R.drawable.about_climate;
        list.add(new AboutCity(aboutClimateImageId, aboutClimate, aboutClimateDesc));

        String aboutEco = context.getString(R.string.about_eco_title);
        String aboutEcoDesc = context.getString(R.string.about_eco_desc);
        int aboutEcoImageId = R.drawable.about_eco;
        list.add(new AboutCity(aboutEcoImageId, aboutEco, aboutEcoDesc));

        String aboutGeo = context.getString(R.string.about_geo_title);
        String aboutGeoDesc = context.getString(R.string.about_geo_desc);
        int aboutGeoImg = R.drawable.about_geo;
        list.add(new AboutCity(aboutGeoImg, aboutGeo, aboutGeoDesc));

    }

}