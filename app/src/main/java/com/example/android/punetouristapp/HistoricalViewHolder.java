package com.example.android.punetouristapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by UFO_24 on 16-10-2017.
 */

public class HistoricalViewHolder {

    @BindView(R.id.place_title_id)
    TextView histName;
    @BindView(R.id.historical_img_id)
    ImageView imageView;
    @BindView(R.id.historical_desc_id)
    TextView histDesc;
    @BindView(R.id.historical_add_id)
    TextView histAdd;
    @BindView(R.id.historical_built_id)
    TextView histBuilt;
    @BindView(R.id.historical_timings_id)
    TextView histTimings;
    @BindView(R.id.historical_contact_id)
    TextView histContact;
    @BindView(R.id.historical_architecture_id)
    TextView histArch;

    public HistoricalViewHolder(View view) {
        ButterKnife.bind(this, view);
    }

    public void populateViews(HistoricalPlace histItem) {

        histName.setText(histItem.GetPlaceName());
        histDesc.setText(histItem.GetDesc());
        histTimings.setText(histItem.GetTimings());
        histBuilt.setText(histItem.GetYearBuilt());
        histAdd.setText(histItem.GetLocation().GetAddress());
        histContact.setText(histItem.GetLocation().GetContact());
        histArch.setText(histItem.GetArchStyle());
        imageView.setImageResource(histItem.GetImageId());

    }

}
