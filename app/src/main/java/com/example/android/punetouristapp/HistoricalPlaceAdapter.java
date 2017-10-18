package com.example.android.punetouristapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by UFO_24 on 10-10-2017.
 */

public class HistoricalPlaceAdapter extends ArrayAdapter<HistoricalPlace> {

    public HistoricalPlaceAdapter(Activity context, int id, List<HistoricalPlace> histPlaceList) {
        super(context, 0, histPlaceList);

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView;
        HistoricalViewHolder viewHolder;
        HistoricalPlace histItem = getItem(position);

        if (convertView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.historical_places, parent, false);


            viewHolder = new HistoricalViewHolder(listItemView);

            listItemView.setTag(viewHolder);

        } else {
            listItemView = convertView;

            viewHolder = (HistoricalViewHolder) listItemView.getTag();
        }


        viewHolder.populateViews(histItem);

        return listItemView;

    }

}
