package com.example.alber.tourguide;

import android.content.Context;

import java.util.List;

class Museums {
    static void initMuseumsList(List<Location> list, Context context) {

        list.add(new Location(
                context.getString(R.string.museums_prado_description),
                context.getString(R.string.museums_prado),
                context.getString(R.string.address),
                context.getString(R.string.phone),
                context.getString(R.string.schedule),
                context.getString(R.string.price),
                R.drawable.prado2
        ));

        list.add(new Location(
                context.getString(R.string.museums_reina_description),
                context.getString(R.string.museums_reina),
                context.getString(R.string.address),
                context.getString(R.string.phone),
                context.getString(R.string.schedule),
                context.getString(R.string.price),
                R.drawable.reinasofia01
        ));
        list.add(new Location(
                context.getString(R.string.museums_thissen_description),
                context.getString(R.string.museums_thissen),
                context.getString(R.string.address),
                context.getString(R.string.phone),
                context.getString(R.string.schedule),
                context.getString(R.string.price),
                R.drawable.thyssen1
        ));

    }

}


