package com.example.adapter_in_android.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.adapter_in_android.R;

import java.util.ArrayList;

public class MyAdapter2 extends BaseAdapter {
    int resource;
    ArrayList<String> items;
    Context context;

    public MyAdapter2(int resource, ArrayList<String> items, Context context) {
        this.resource = resource;
        this.items = items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(v == null){
            v = LayoutInflater.from(context).inflate(resource, null, false);
        }
        TextView tv = v.findViewById(R.id.custom_row_tv);
        tv.setText((String)getItem(position));
        return v;
    }
}
