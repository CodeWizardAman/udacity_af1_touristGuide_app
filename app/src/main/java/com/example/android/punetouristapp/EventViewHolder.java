package com.example.android.punetouristapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by UFO_24 on 16-10-2017.
 */

public class EventViewHolder {
    @BindView(R.id.event_name_id)
    TextView eventName;
    @BindView(R.id.event_image_id)
    ImageView eventImage;
    @BindView(R.id.event_desc_id)
    TextView eventDesc;
    @BindView(R.id.event_add_id)
    TextView eventAdd;
    @BindView(R.id.event_contact__id)
    TextView eventContact;
    @BindView(R.id.event_date__id)
    TextView eventTimings;

    public EventViewHolder(View view) {
        ButterKnife.bind(this, view);
    }

    public void populateViews(Events eventItem) {

        eventName.setText(eventItem.GetEventName());
        eventImage.setImageResource(eventItem.GetEventImgRes());
        eventDesc.setText(eventItem.GetEventDesc());
        eventAdd.setText(eventItem.GetEventLoc().GetAddress());
        eventContact.setText(eventItem.GetEventLoc().GetContact());
        eventTimings.setText(eventItem.GetEventTimings());

    }
}
