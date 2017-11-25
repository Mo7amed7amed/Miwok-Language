package com.example.mohamed.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PharasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharases);
        // Create a list of words
        ArrayList<Word> Words = new ArrayList<Word>();
        Words.add(new Word("Where are you going?", "minto wuksus"));
        Words.add(new Word("What is your name?", "tinnә oyaase'nә"));
        Words.add(new Word("My name is...", "oyaaset..."));
        Words.add(new Word("How are you feeling?", "michәksәs?"));
        Words.add(new Word("I’m feeling good.", "kuchi achit"));
        Words.add(new Word("Are you coming?", "әәnәs'aa?"));
        Words.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        Words.add(new Word("I’m coming.", "әәnәm"));
        Words.add(new Word("Let’s go.", "yoowutis"));
        Words.add(new Word("Come here.", "әnni'nem"));

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
    }
}
