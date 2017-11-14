package com.example.mohamed.miwok;

import android.view.View;
import android.widget.Toast;


/**
 * Created by Mohamed on 01/11/2017.
 */

public class NumbersClickListner implements View.OnClickListener {
    @Override
    public void onClick(View v) {
        Toast.makeText(v.getContext(),"Open The Number List",Toast.LENGTH_LONG).show();
    }
}
