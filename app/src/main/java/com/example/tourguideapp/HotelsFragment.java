package com.example.tourguideapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public HotelsFragment() {
        // Required empty public constructor
    }

    public static HotelsFragment newInstance(String param1, String param2) {
        HotelsFragment fragment = new HotelsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.hotel_list, container, false);
        final ArrayList<Hotel> Hotels = new ArrayList<>();
        Hotels.add(new Hotel(getContext().getString(R.string.color_red),
                getContext().getString(R.string.tourguide_color_red),
                1));
        Hotels.add(new Hotel(getContext().getString(R.string.color_mustard_yellow),
                getContext().getString(R.string.tourguide_color_mustard_yellow),
                2));
        Hotels.add(new Hotel(getContext().getString(R.string.color_dusty_yellow),
                getContext().getString(R.string.tourguide_color_dusty_yellow),
                3));
        Hotels.add(new Hotel(getContext().getString(R.string.color_green),
                getContext().getString(R.string.tourguide_color_green),
                4));
        Hotels.add(new Hotel(getContext().getString(R.string.color_brown),
                getContext().getString(R.string.tourguide_color_brown),
                5));
        Hotels.add(new Hotel(getContext().getString(R.string.color_gray),
                getContext().getString(R.string.tourguide_color_gray),
                6));
        Hotels.add(new Hotel(getContext().getString(R.string.color_black),
                getContext().getString(R.string.tourguide_color_black),
                7));
        Hotels.add(new Hotel(getContext().getString(R.string.color_white),
                getContext().getString(R.string.tourguide_color_white),
                8));

        HotelAdapter adapter = new HotelAdapter(getActivity(), Hotels, R.color.attraction_hotels);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Hotel Hotel = Hotels.get(position);
            }
        });
        return rootView;
    }
}
