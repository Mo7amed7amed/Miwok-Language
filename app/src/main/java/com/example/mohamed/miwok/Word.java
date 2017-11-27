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
    //Audio Resource Id for the word
    private int mAudioResourceId;
    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = 0;

    public Word(String defaultTranslation ,String miwokTranslation , int audioResourceId){
        mDefaultTranslation = defaultTranslation ;
        mMiwokTranslation = miwokTranslation ;
        mAudioResourceId = audioResourceId ;
    }
    public Word(String defaultTranslation ,String miwokTranslation , int ImageResourceId ,int audioResourceId){
        mDefaultTranslation = defaultTranslation ;
        mMiwokTranslation = miwokTranslation ;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = audioResourceId ;
    }
    //Get The Default Translation of The Word
    public String getmDefaultTranslation(){
        return mDefaultTranslation ;
    }
    //Get The Miwok translation for the word
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getmImageResourceId(){return mImageResourceId;}

    public int getmAudioResourceId(){return mAudioResourceId;}
    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    }
