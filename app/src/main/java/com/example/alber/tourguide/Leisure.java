package com.example.alber.tourguide;

import android.content.Context;

import java.util.List;

public class Leisure {
    public static void initLeisureList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.category_leisure),
                context.getString(R.string.leisure_comercial_center),
                context.getString(R.string.leisure_comercial_description),
                context.getString(R.string.phone),
                context.getString(R.string.schedule),
                context.getString(R.string.price),
                R.drawable.xanadu_madrid_snowzone
        ));
        list.add(new Location(
                context.getString(R.string.category_leisure),
                context.getString(R.string.leisure_comercial_description),
                context.getString(R.string.address),
                context.getString(R.string.phone),
                context.getString(R.string.schedule),
                context.getString(R.string.price),
                R.drawable.pista_xanadu
        ));
    }
}
