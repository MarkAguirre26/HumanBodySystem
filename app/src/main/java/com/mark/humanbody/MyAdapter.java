package com.mark.humanbody;

/**
 * Created by Mark on 2/19/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Item> {

    ArrayList<Item> item = new ArrayList<>();

    public MyAdapter(Context context, int textViewResourceId, ArrayList<Item> objects) {
        super(context, textViewResourceId, objects);
        item = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.layout_category, null);
        TextView txt_item = (TextView) v.findViewById(R.id.textView);
        TextView txt_count = (TextView) v.findViewById(R.id.txt_itemCount);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
        txt_item.setText(item.get(position).getAnimalName());
        txt_item.setTag(item.get(position).getTag());
        imageView.setImageResource(item.get(position).getAnimalImage());
        txt_count.setText("("+String.valueOf(item.get(position).getItemCount())+")");


        return v;

    }

}