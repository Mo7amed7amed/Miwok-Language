package com.example.mohamed.miwok;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;
/**
 * Created by Mohamed on 07/11/2017.
 */

public class wordAdapter extends ArrayAdapter<Word> {
    public wordAdapter(@NonNull Context context, @NonNull List<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
     View listItemView = convertView;
        if(listItemView == null){
           listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        }
         Word currentWord=getItem(position);
        TextView miwokTextview = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextview.setText(currentWord.getmMiwokTranslation());

        TextView defaultTextview = (TextView) listItemView.findViewById(R.id.default_tex_view);
        defaultTextview.setText(currentWord.getmDefaultTranslation());
        return listItemView;

    }
}
