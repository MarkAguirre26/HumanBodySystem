package com.mark.humanbody;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * PlayerAdapter * Created by Mark on 10/18/2016.
 */

public class AnswersAdapter extends BaseAdapter {
    private Activity activity;
    private ArrayList data;
    private static LayoutInflater inflater = null;

    Answer tempValues = null;
    int i = 0;

    public AnswersAdapter(Activity activity_, ArrayList arrayList) {
        activity = activity_;
        data = arrayList;
        inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        if (data.size() <= 0)
            return 1;
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public static class ViewHolder {
        public TextView text1;
        public TextView text2;
        public TextView text3;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        ViewHolder holder;

        if (convertView == null) {

            vi = inflater.inflate(R.layout.row_answer, null);
            holder = new ViewHolder();
            holder.text1 = (TextView) vi.findViewById(R.id.txt_answer_no);
            holder.text2 = (TextView) vi.findViewById(R.id.txt_answer_Answer);
            holder.text3 = (TextView) vi.findViewById(R.id.txt_answer_remark);


            /************  Set holder with LayoutInflater ************/
            vi.setTag(holder);
        } else
            holder = (ViewHolder) vi.getTag();

        if (data.size() <= 0) {
            holder.text1.setText("No Data");

        } else {

            tempValues = null;
            tempValues = (Answer) data.get(position);
            holder.text1.setText(Integer.toString(Integer.valueOf(tempValues.getCn())));
            holder.text2.setText(tempValues.getAnswer());
            holder.text3.setText(tempValues.getRemark());


        }
        return vi;
    }

    public void updateResult(ArrayList<Answer> a) {
        this.data = a;
        notifyDataSetChanged();
    }
}
