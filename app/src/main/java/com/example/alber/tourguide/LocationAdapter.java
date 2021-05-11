package com.example.alber.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lara on 29/8/16.
 */
public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, int resources, List<Location> locationsList) {
        super(context, 0, locationsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Location currentLocation = getItem(position);
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        TextView nameLocationTextView = (TextView) listItemView.findViewById(R.id.nameTextView);
        nameLocationTextView.setText(currentLocation.getName());

        TextView descriptionLocationTextView = (TextView)
                listItemView.findViewById(R.id.descriptionTextView);
        descriptionLocationTextView.setText(currentLocation.getDescription());


        ImageView photoLocationImageView = (ImageView) listItemView.findViewById(R.id.photoImageView);

        if (currentLocation.hasImage()){
            photoLocationImageView.setImageResource(currentLocation.getImageResourceId());
            photoLocationImageView.setVisibility(View.VISIBLE);
        } else {
            photoLocationImageView.setVisibility(View.GONE);
        }
        return listItemView;
    }


}
