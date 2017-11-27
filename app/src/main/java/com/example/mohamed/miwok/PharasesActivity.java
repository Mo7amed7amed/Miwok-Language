package com.example.mohamed.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PharasesActivity extends AppCompatActivity {
MediaPlayer mMediaPlayer ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharases);
        // Create a list of words
       final ArrayList<Word> Words = new ArrayList<Word>();
        Words.add(new Word("Where are you going?", "minto wuksus" , R.raw.phrase_where_are_you_going ));
        Words.add(new Word("What is your name?", "tinnә oyaase'nә" , R.raw.phrase_what_is_your_name));
        Words.add(new Word("My name is...", "oyaaset..." , R.raw.phrase_my_name_is));
        Words.add(new Word("How are you feeling?", "michәksәs?" ,R.raw.phrase_how_are_you_feeling));
        Words.add(new Word("I’m feeling good.", "kuchi achit",R.raw.phrase_im_feeling_good));
        Words.add(new Word("Are you coming?", "әәnәs'aa?",R.raw.phrase_are_you_coming));
        Words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm",R.raw.phrase_yes_im_coming));
        Words.add(new Word("I’m coming.", "әәnәm",R.raw.phrase_im_coming));
        Words.add(new Word("Let’s go.", "yoowutis",R.raw.phrase_lets_go));
        Words.add(new Word("Come here.", "әnni'nem",R.raw.phrase_come_here));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        wordAdapter adapter = new wordAdapter(this, Words,R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Toast .makeText(NumbersActivity.this ,"I Really Get In Love With You" ,Toast.LENGTH_LONG).show();

                // Get the {@link Word} object at the given position the user clicked on
                Word word = Words.get(position);
                mMediaPlayer =  MediaPlayer.create(PharasesActivity.this ,word.getmAudioResourceId());
                //start the audio file
                mMediaPlayer.start();
            }
        });
    }
}
