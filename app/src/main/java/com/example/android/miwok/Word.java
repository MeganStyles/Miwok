package com.example.android.miwok;

import android.media.Image;

/**
 * Created by stylesm on 20/09/2016.
 * The new object of type{@Link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    //Image that corresponds to translations
    private int mImageResourceId;

    //String value of default translation
    private String mDefaultTranslation;

    //String value of Miwok translation
    private String mMiwokTranslation;

    /**
     * Constructor - is like a method but the name must match class name exactly.
     * Constructs a new object of class Word with the initial values for DefaultTranslation and MiwokTranslation
     */
    public Word(int imageResourceId, String defaultTranslation, String miwokTranslation) {

        mImageResourceId = imageResourceId;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    public Word(String defaultTranslation, String miwokTranslation) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public int getImageResourceId() { return  mImageResourceId; }

    /**
     * Get the default translation of the word.
     * @return
     */
    public String getDefalaultTranlsation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     * @return
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

}
