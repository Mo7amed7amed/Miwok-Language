package com.example.mohamed.miwok;

/**
 * Created by Mohamed on 07/11/2017.
 */

public class Word {

    //Default translation for the word
    private String mDefaultTranslation;
    //Miwok translation for the word
    private String mMiwokTranslation;
    //Image Resource id For the word
    private int mImageResourceId = NO_IMAGE_PROVIDED; ;
    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = 0;

    public Word(String defaultTranslation ,String miwokTranslation){
        mDefaultTranslation = defaultTranslation ;
        mMiwokTranslation = miwokTranslation ;
    }
    public Word(String defaultTranslation ,String miwokTranslation , int ImageResourceId){
        mDefaultTranslation = defaultTranslation ;
        mMiwokTranslation = miwokTranslation ;
        mImageResourceId = ImageResourceId;
    }
    //Get The Default Translation of The Word
    public String getmDefaultTranslation(){
        return mDefaultTranslation ;
    }
    //Get The Miwok translation for the word
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getmImageResourceId(){
        return mImageResourceId;}
    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    }
