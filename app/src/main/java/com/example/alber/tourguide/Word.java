package com.example.alber.tourguide;

public class Word {
    private int mGuideTranslationId;
    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

/**
 * Create a new Word object.
 */
public Word(int imageResurceId, int GuideTranslationId) {
    mImageResourceId = imageResurceId;
    mGuideTranslationId = GuideTranslationId;
}

public int getmGuideTranslationId(){
    return mGuideTranslationId;
}
    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}


