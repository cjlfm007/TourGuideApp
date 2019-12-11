package com.example.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import androidx.core.content.ContextCompat;

public class HotelAdapter extends ArrayAdapter<Hotel> {
    private int mColorResourceId;

    public HotelAdapter(Context context, ArrayList<Hotel> Hotels, int colorResourceId) {
        super(context, 0, Hotels);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Hotel currentHotel = getItem(position);
        TextView miwokTextView = listItemView.findViewById(R.id.tourguide_text_view);
        miwokTextView.setText(currentHotel.getName());

        TextView defaultTextView = listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentHotel.getPrice());

        ImageView imageView = listItemView.findViewById(R.id.image);
        if (currentHotel.hasImage()) {
            imageView.setImageResource(currentHotel.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}
