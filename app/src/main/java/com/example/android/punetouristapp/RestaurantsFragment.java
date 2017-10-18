package com.example.android.punetouristapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class RestaurantsFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<Restaurants> restaurantList = new ArrayList<>();

        // Fill the list with Restaurants objects
        InitRestaurants.initRestaurantList(getContext(), restaurantList);

        RestaurantAdapter adapter = new RestaurantAdapter(getActivity(), -1, restaurantList);
        View view = inflater.inflate(R.layout.general_list, container, false);
        ListView listView = (ListView) view.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        return view;
    }
}