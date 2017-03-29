package com.mark.humanbody;

/**
 * Created by Mark on 2/19/2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FactDefAdapter extends ArrayAdapter<Itemfacts> {

    ArrayList<Itemfacts> item = new ArrayList<>();

    public FactDefAdapter(Context context, int textViewResourceId, ArrayList<Itemfacts> objects) {
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
        v = inflater.inflate(R.layout.row_facts, null);
        TextView txt_header = (TextView) v.findViewById(R.id.txt_header);
        TextView txt_content = (TextView) v.findViewById(R.id.txt_content);
        txt_header.setText(item.get(position).getHeader());
        txt_content.setText(item.get(position).getContent());


        return v;

    }

}