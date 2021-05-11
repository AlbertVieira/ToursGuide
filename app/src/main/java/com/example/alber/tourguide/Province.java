package com.example.alber.tourguide;

import android.content.Context;

import java.util.List;

public class Province {
    public static void initProvinceList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.province_aranjuez),
                context.getString(R.string.province_aranjuez_description),
                context.getString(R.string.address),
                context.getString(R.string.phone),
                context.getString(R.string.schedule),
                context.getString(R.string.price),
                R.drawable.gardens_royal_palace_aranjuez
        ));
    }

}

