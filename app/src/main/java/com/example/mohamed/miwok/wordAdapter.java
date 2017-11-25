package com.example.mohamed.miwok;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mohamed on 07/11/2017.
 */

public class wordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;
    public wordAdapter(@NonNull Context context, @NonNull List<Word> words ,int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId ;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);
        TextView miwokTextview = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextview.setText(currentWord.getmMiwokTranslation());

        TextView defaultTextview = (TextView) listItemView.findViewById(R.id.default_tex_view);
        defaultTextview.setText(currentWord.getmDefaultTranslation());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
// Set the ImageView to the image resource specified in the current Word
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getmImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }
        //set the theme color for thee list item
       View textContainer = listItemView.findViewById(R.id.text_container);
        //find the  color that the resource id maps to
       int color = ContextCompat.getColor(getContext(),mColorResourceId);
       //set the background coor for the text container view
       textContainer.setBackgroundColor(color);
        return listItemView;

    }
}
