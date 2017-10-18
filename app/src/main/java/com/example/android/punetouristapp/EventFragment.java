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

/**
 * Created by UFO_24 on 09-10-2017.
 */

public class EventFragment extends Fragment {

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        List<Events> eventList = new ArrayList<>();

        // Fill the list with Event objects
        InitEvents.initEvents(getContext(), eventList);

        EventAdapter adapter = new EventAdapter(getActivity(), -1, eventList);

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.general_list, container, false);
        ListView listView = (ListView) view.findViewById(R.id.list_view);

        listView.setAdapter(adapter);

        return view;

    }

}
