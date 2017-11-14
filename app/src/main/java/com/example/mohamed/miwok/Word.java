package com.example.mohamed.miwok;

/**
 * Created by Mohamed on 07/11/2017.
 */

public class Word {

    //Default translation for the word
    private String mDefaultTranslation;
    //Miwok translation for the word
    private String mMiwokTranslation;

    public Word(String defaultTranslation ,String miwokTranslation){
        mDefaultTranslation = defaultTranslation ;
        mMiwokTranslation = miwokTranslation ;
    }
    //Get The Default Translation of The Word
    public String getmDefaultTranslation(){
        return mDefaultTranslation ;
    }
    //Get The Miwok translation for the word
    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }
}
