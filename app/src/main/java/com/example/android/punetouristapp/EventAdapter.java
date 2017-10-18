package com.example.android.punetouristapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by UFO_24 on 09-10-2017.
 */

public class EventAdapter extends ArrayAdapter<Events> {

    public EventAdapter(Activity context, int id, List<Events> eventList) {
        super(context, 0, eventList);

    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView;
        EventViewHolder viewHolder;
        Events eventItem = getItem(position);
        if (convertView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.event_layout, parent, false);

            viewHolder = new EventViewHolder(listItemView);

            listItemView.setTag(viewHolder);

        } else {
            listItemView = convertView;
            viewHolder = (EventViewHolder) listItemView.getTag();
        }

        viewHolder.populateViews(eventItem);

        return listItemView;

    }

}
