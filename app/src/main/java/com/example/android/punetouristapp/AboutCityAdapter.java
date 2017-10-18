package com.example.android.punetouristapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by UFO_24 on 08-10-2017.
 */

public class AboutCityAdapter extends ArrayAdapter<AboutCity> {

    public AboutCityAdapter(Activity context, int id, List<AboutCity> aboutCityList) {
        super(context, 0, aboutCityList);

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        AboutCityViewHolder viewHolder;
        AboutCity aboutCityItem = getItem(position);
        View listItemView;
        if (convertView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.about_city, parent, false);

            ImageView imageView = (ImageView) listItemView.findViewById(R.id.city_image_id);

            TextView textView = (TextView) listItemView.findViewById(R.id.city_title_id);

            TextView textView1 = (TextView) listItemView.findViewById(R.id.city_desc_id);

            viewHolder = new AboutCityViewHolder(listItemView);

            listItemView.setTag(viewHolder);

        } else {
            listItemView = convertView;
            viewHolder = (AboutCityViewHolder) listItemView.getTag();
        }

        viewHolder.populateViews(aboutCityItem);
        return listItemView;

    }

}
