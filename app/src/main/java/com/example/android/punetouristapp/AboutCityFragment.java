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

public class AboutCityFragment extends Fragment {

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        List<AboutCity> aboutCityList = new ArrayList<>();

        // Fill the list with AboutCity objects
        InitAboutCity.initAboutCity(getContext(), aboutCityList);

        AboutCityAdapter adapter = new AboutCityAdapter(getActivity(), -1, aboutCityList);

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.general_list, container, false);
        ListView listView = (ListView) view.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        return view;

    }

}
