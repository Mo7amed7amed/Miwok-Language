package com.example.mohamed.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        //Create an ArrayList of Words
        final ArrayList<Word> Words=new ArrayList<Word>();

        Words.add(new Word("Red" ,"weṭeṭṭi" ,R.drawable.color_red,R.raw.color_red));
        Words.add(new Word("Green" ,"chokokki",R.drawable.color_green,R.raw.color_green ));
        Words.add(new Word("Brawn" ,"ṭakaakki",R.drawable.color_brown,R.raw.color_brown ));
        Words.add(new Word("Gray" ,"ṭopoppi",R.drawable.color_gray,R.raw.color_gray ));
        Words.add(new Word("Black" ,"kululli",R.drawable.color_black,R.raw.color_black ));
        Words.add(new Word("White" ,"kelelli",R.drawable.color_white,R.raw.color_white ));
        Words.add(new Word("Dusty Yellow" ,"ṭopiisә",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow ));
        Words.add(new Word("Mustard Yellow" ,"chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow ));

        wordAdapter adapter = new wordAdapter(this, Words,R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Toast .makeText(NumbersActivity.this ,"I Really Get In Love With You" ,Toast.LENGTH_LONG).show();

                // Get the {@link Word} object at the given position the user clicked on
                Word word = Words.get(position);
                mMediaPlayer =  MediaPlayer.create(ColorsActivity.this ,word.getmAudioResourceId());
                //start the audio file
                mMediaPlayer.start();
            }
        });

    }
}
