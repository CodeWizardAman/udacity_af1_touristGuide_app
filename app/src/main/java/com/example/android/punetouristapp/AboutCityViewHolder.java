package com.example.android.punetouristapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by UFO_24 on 16-10-2017.
 */

public class AboutCityViewHolder {

    @BindView(R.id.city_title_id)
    TextView cityTitle;
    @BindView(R.id.city_image_id)
    ImageView cityImage;
    @BindView(R.id.city_desc_id)
    TextView cityDesc;

    public ImageView m_cityImage;
    public TextView m_cityTitle;
    public TextView m_cityDesc;

    public AboutCityViewHolder(View view) {
        ButterKnife.bind(this, view);
    }

    public void populateViews(AboutCity aboutCityItem) {

        cityImage.setImageResource(aboutCityItem.GetImageId());
        cityTitle.setText(aboutCityItem.GetTitle());
        cityDesc.setText(aboutCityItem.GetCityDescription());

    }
}
