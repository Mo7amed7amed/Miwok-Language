package com.example.mohamed.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        //Create an ArrayList of Words
        ArrayList<Word> Words=new ArrayList<Word>();

        Words.add(new Word("Red" ,"weṭeṭṭi" ,R.drawable.color_red));
        Words.add(new Word("Green" ,"chokokki",R.drawable.color_green));
        Words.add(new Word("Brawn" ,"ṭakaakki",R.drawable.color_brown));
        Words.add(new Word("Gray" ,"ṭopoppi",R.drawable.color_gray));
        Words.add(new Word("Black" ,"kululli",R.drawable.color_black));
        Words.add(new Word("White" ,"kelelli",R.drawable.color_white));
        Words.add(new Word("Dusty Yellow" ,"ṭopiisә",R.drawable.color_dusty_yellow));
        Words.add(new Word("Mustard Yellow" ,"chiwiiṭә",R.drawable.color_mustard_yellow));

        wordAdapter adapter = new wordAdapter(this, Words,R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
