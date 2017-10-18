package com.example.android.punetouristapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by UFO_24 on 08-10-2017.
 */

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new AboutCityFragment();
        } else if (position == 1) {
            return new RestaurantsFragment();
        } else if (position == 2) {
            return new EventFragment();
        } else
            return new HistorialPlaceFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.category_aboutCity);
        } else if (position == 1) {
            return context.getString(R.string.category_restaurants);
        } else if (position == 2) {
            return context.getString(R.string.category_events);
        } else
            return context.getString(R.string.category_histPlaces);
    }
}

