package com.example.mohamed.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        //Create an ArrayList of Words
        final ArrayList<Word> Words=new ArrayList<Word>();

        Words.add(new Word("Father" ,"әpә" ,R.drawable.family_father ,R.raw.family_father));
        Words.add(new Word("Mother" ,"әṭa",R.drawable.family_mother ,R.raw.family_mother));
        Words.add(new Word("Son" ,"angsi",R.drawable.family_son ,R.raw.family_son));
        Words.add(new Word("Daughter" ,"tune",R.drawable.family_daughter ,R.raw.family_daughter));
        Words.add(new Word("Older Brother" ,"taachi",R.drawable.family_older_brother ,R.raw.family_older_brother));
        Words.add(new Word("Younger Brother" ,"chalitti",R.drawable.family_younger_brother ,R.raw.family_younger_brother));
        Words.add(new Word("Older Sister" ,"teṭe",R.drawable.family_older_sister ,R.raw.family_older_sister));
        Words.add(new Word("Younger Sister" ,"kolliti",R.drawable.family_younger_sister ,R.raw.family_younger_sister));
        Words.add(new Word("Grandmother" ,"ama",R.drawable.family_grandmother ,R.raw.family_grandmother));
        Words.add(new Word("Grandfather" ,"paapa",R.drawable.family_grandfather ,R.raw.family_grandfather));

        wordAdapter adapter = new wordAdapter(this, Words,R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Toast .makeText(NumbersActivity.this ,"I Really Get In Love With You" ,Toast.LENGTH_LONG).show();

               // Get the {@link Word} object at the given position the user clicked on
                Word word = Words.get(position);
                mMediaPlayer =  MediaPlayer.create(FamilyActivity.this ,word.getmAudioResourceId());
                //start the audio file
                mMediaPlayer.start();
            }
        });
    }
}
