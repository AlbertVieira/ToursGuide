package com.example.alber.tourguide;

import android.util.Log;

public class Location {

    private String name;
    private String description;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    public Location(String name, String description, String address, String phone, String schedule,
                    String price, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public Location(int category_museums, int museo_prado) {

        getImageResourceId();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage(){
        Log.v("hasImage", "word has image: "+ (imageResourceId != NO_IMAGE_PROVIDED));
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        String output = getName() + "\n" +
                getDescription() + "\n" +
                getImageResourceId()
                ;
        return output;
    }
}
