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

public class FactAdapter extends ArrayAdapter<FactModel> {

    ArrayList<FactModel> item = new ArrayList<>();

    public FactAdapter(Context context, int textViewResourceId, ArrayList<FactModel> objects) {
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
        v = inflater.inflate(R.layout.layout_fact, null);
        TextView txt_item = (TextView) v.findViewById(R.id.textView);
        ImageView img = (ImageView) v.findViewById(R.id.imageView);
        txt_item.setText(item.get(position).getFactname());
        img.setImageResource(item.get(position).getImage());
        txt_item.setTag(item.get(position).getTag());

        return v;

    }

}