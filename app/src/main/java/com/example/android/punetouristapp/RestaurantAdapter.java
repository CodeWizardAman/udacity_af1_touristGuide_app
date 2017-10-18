package com.example.android.punetouristapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by UFO_24 on 08-10-2017.
 */

public class RestaurantAdapter extends ArrayAdapter<Restaurants> {

    public RestaurantAdapter(Context context, int resources, List<Restaurants> restList) {
        super(context, 0, restList);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView;
        RestaurantViewHolder viewHolder;

        Restaurants currentRestaurant = getItem(position);

        if (convertView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.restaurant_layout, parent, false);

            viewHolder = new RestaurantViewHolder(listItemView);
            listItemView.setTag(viewHolder);
        } else {
            listItemView = convertView;
            viewHolder = (RestaurantViewHolder) listItemView.getTag();
        }

        viewHolder.populateViews(currentRestaurant);

        return listItemView;
    }
}