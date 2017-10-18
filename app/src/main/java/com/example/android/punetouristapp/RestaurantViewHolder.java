package com.example.android.punetouristapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by UFO_24 on 16-10-2017.
 */

public class RestaurantViewHolder {
    @BindView(R.id.rest_title_id)
    TextView restName;
    @BindView(R.id.rest_image_id)
    ImageView imageView;
    @BindView(R.id.rest_desc_id)
    TextView restDesc;
    @BindView(R.id.rest_add_id)
    TextView restAdd;
    @BindView(R.id.rest_contact_id)
    TextView restContact;


    public RestaurantViewHolder(View view) {
        ButterKnife.bind(this, view);

    }

    public void populateViews(Restaurants currentRestaurant) {

        imageView.setImageResource(currentRestaurant.GetImageId());
        restName.setText(currentRestaurant.GetRestaurantName());
        restDesc.setText(currentRestaurant.GetRstaurantDesc());
        restAdd.setText(currentRestaurant.GetLocation().GetAddress());
        restContact.setText(currentRestaurant.GetLocation().GetContact());

    }

}
