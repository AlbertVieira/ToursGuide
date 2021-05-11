package com.example.alber.tourguide;

import android.content.Context;

import java.util.List;

public class Monuments {
    public static void initMonumentsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.puerta_alcala),
                context.getString(R.string.puerta_description),
                context.getString(R.string.address),
                context.getString(R.string.phone),
                context.getString(R.string.schedule),
                context.getString(R.string.price),
                R.drawable.puerta_alcala
        ));
        list.add(new Location(
                context.getString(R.string.puerta_sol),
                context.getString(R.string.puerta_sol_description),
                context.getString(R.string.address),
                context.getString(R.string.phone),
                context.getString(R.string.schedule),
                context.getString(R.string.price),
                R.drawable.puerta_sol
        ));
    }

}


