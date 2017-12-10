package com.example.mohamed.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //set the content of the main activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        //find the view that show the number category
        TextView numbers = (TextView) findViewById(R.id.Numbers);

//        //create object of the NumbersclickListner
//        NumbersClickListner clickListner=new NumbersClickListner();

        // set a clickListner on that view
        numbers.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the number category is clicked on
            @Override
            public void onClick(View v) {
                //create anew intent to open the Number activity
                Intent intentNumber = new Intent(MainActivity.this, NumbersActivity.class);
                //start the new activity
                startActivity(intentNumber);
            }
        });

        //find the view that show the Colors category
        TextView colors = (TextView) findViewById(R.id.Colors);

        // set a clickListner on that view
        colors.setOnClickListener(new OnClickListener() {

            // The code in this method will be executed when the colors category is clicked on
            @Override
            public void onClick(View v) {
                //ceate anew intent to open the color activity
                Intent intentColor = new Intent(MainActivity.this, ColorsActivity.class);
                //start the new activity
                startActivity(intentColor);
            }
        });


        //find the view that show the family category
        TextView family = (TextView) findViewById(R.id.Family);

        // set a clickListner on that view
        family.setOnClickListener(new OnClickListener() {

            // The code in this method will be executed when the family category is clicked on
            @Override
            public void onClick(View v) {
                //ceate anew intent to open the family activity
                Intent intentFamily = new Intent(MainActivity.this, FamilyActivity.class);
                //start the new activity
                startActivity(intentFamily);
            }
        });

        //find the view that show the pharases category
        TextView pharases = (TextView) findViewById(R.id.Phrases);

        // set a clickListner on that view
        pharases.setOnClickListener(new OnClickListener() {

            // The code in this method will be executed when the pharases category is clicked on
            @Override
            public void onClick(View v) {
                //create anew intent to open the pharases activity
                Intent intentPharase = new Intent(MainActivity.this, PharasesActivity.class);
                //start the new activity
                startActivity(intentPharase);
            }
        });

    }
//
//    public void openNumberList(View view) {
//        Intent intentNumber = new Intent (MainActivity.this ,NumbersActivity.class);
//        startActivity(intentNumber);
//    }
//
//    public void openFamelyList(View view) {
//        Intent intentFamily = new Intent(MainActivity.this, FamilyActivity.class);
//        startActivity(intentFamily);
//    }
//
//    public void openColorsList(View view) {
//        Intent intentColor = new Intent(MainActivity.this, ColorsActivity.class);
//        startActivity(intentColor);
//    }
//
//    public void openPhrasesList(View view) {
//        Intent intentPharase = new Intent(MainActivity.this, PharasesActivity.class);
//        startActivity(intentPharase);
//    }
}
