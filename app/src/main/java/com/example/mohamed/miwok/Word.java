package com.example.mohamed.miwok;

/**
 * Created by Mohamed on 07/11/2017.
 */

public class Word {

    private String mDefaultTranslation;

    private int imageResouceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    private String mMiwokTranslation;

    private static final int NO_IMAGE_PROVIDED= -1;

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", imageResouceId=" + imageResouceId +
                ", mAudioResourceId=" + mAudioResourceId +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                '}';
    }

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String mDefaultTranslation, int mAudioResourceId, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mAudioResourceId = mAudioResourceId;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int imageResouceId, int mAudioResourceId) {
        this.mAudioResourceId = mAudioResourceId;
        this.mDefaultTranslation = mDefaultTranslation;
        this.imageResouceId = imageResouceId;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public void setImageResouceId(int imageResouceId) {
        this.imageResouceId = imageResouceId;
    }

    public void setmAudioResourceId(int mAudioResourceId) {
        this.mAudioResourceId = mAudioResourceId;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setmMiwokTranslation(String mMiwokTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public static int getNoImageProvided() {
        return NO_IMAGE_PROVIDED;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mAudioResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mAudioResourceId = mAudioResourceId;

        this.mMiwokTranslation = mMiwokTranslation;
    }

    public Word(String mDefaultTranslation, int imageResouceId, int mAudioResourceId, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.imageResouceId = imageResouceId;
        this.mAudioResourceId = mAudioResourceId;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResouceId() { return imageResouceId; }

    public boolean hasImage(){
        return imageResouceId != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId(){return mAudioResourceId;}
}
