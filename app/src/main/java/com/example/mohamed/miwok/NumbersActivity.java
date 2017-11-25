package com.example.mohamed.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //Create an ArrayList of Words
        ArrayList<Word> Words=new ArrayList<Word>();

        Words.add(new Word("One" ,"Lutti" ,R.drawable.number_one));
        Words.add(new Word("Two" ,"otiiko",R.drawable.number_two));
        Words.add(new Word("Three" ,"tolookosu",R.drawable.number_three));
        Words.add(new Word("Four" ,"oyyisa",R.drawable.number_four));
        Words.add(new Word("Five" ,"massokka",R.drawable.number_five));
        Words.add(new Word("Six" ,"temmokka",R.drawable.number_six));
        Words.add(new Word("Seven" ,"kenekaku",R.drawable.number_seven));
        Words.add(new Word("Eight" ,"kawinta",R.drawable.number_eight));
        Words.add(new Word("Nine" ,"wo’e",R.drawable.number_nine));
        Words.add(new Word("Ten" ,"na’aacha",R.drawable.number_ten));

//        Words.add("One");
//        Words.add("Two");
//        Words.add("Three");
//        Words.add("Four");
//        Words.add("Five");
//        Words.add("Six");
//        Words.add("Seven");
//        Words.add("Eight");
//        Words.add("Nine");
//        Words.add("Ten");

//        LinearLayout rootView= (LinearLayout) findViewById(R.id.rootView);
        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        wordAdapter adapter = new wordAdapter(this, Words ,R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
//        ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, Words);
//
//        ListView listView = (ListView) findViewById(R.id.list);
//
//        listView.setAdapter(itemsAdapter);

        /*this lines of code use to create an textView and put the first element in the arrayList in that textview
        to put the rest of element to textView You need to create another collection of code lines to do this task
        and this will be Hard so We working with Loops
         */
//        TextView wordView = new TextView(this);
//        wordView.setText(Words.get(0));

//// Create a variable to keep track of the current index positio
//        int index=0;
//
//        while (index < Words.size()){
//// Create a new TextVie
//            TextView wordView = new TextView(this);
//// Set the text to be word at the current index
//            wordView.setText(Words.get(index));
//// Add this TextView as another child to the root view of this layou
//            rootView.addView(wordView);
//// Increment the index variable by
//            index++;
//        }
//        for(int index = 0;index<Words.size();index++){
//            // Create a new TextVie
//            TextView wordView = new TextView(this);
//// Set the text to be word at the current index
//            wordView.setText(Words.get(index));
//// Add this TextView as another child to the root view of this layou
//            rootView.addView(wordView);
//// Increment the index variable by
//        }

// //Verify the content of the arrayList by printing out Each arrayList element to the logs
//        Log.v("NumbersActivity" ,"We Check Word At Index 0 " + Words.get(0));
//        Log.v("NumbersActivity" ,"We Check Word At Index 1 " + Words.get(1));
//        Log.v("NumbersActivity" ,"We Check Word At Index 2 " + Words.get(2));
//        Log.v("NumbersActivity" ,"We Check Word At Index 3 " + Words.get(3));
//        Log.v("NumbersActivity" ,"We Check Word At Index 4 " + Words.get(4));
//        Log.v("NumbersActivity" ,"We Check Word At Index 5 " + Words.get(5));
//        Log.v("NumbersActivity" ,"We Check Word At Index 6 " + Words.get(6));
//        Log.v("NumbersActivity" ,"We Check Word At Index 7 " + Words.get(7));
//        Log.v("NumbersActivity" ,"We Check Word At Index 8 " + Words.get(8));
//        Log.v("NumbersActivity" ,"We Check Word At Index 9 " + Words.get(9));


    }
}
