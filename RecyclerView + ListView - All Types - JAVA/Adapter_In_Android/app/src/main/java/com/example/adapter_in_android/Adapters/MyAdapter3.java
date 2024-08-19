package com.example.adapter_in_android.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.adapter_in_android.R;

import java.util.ArrayList;

// If you specify the class type ArrayAdapter<String> in this case you need
// to the return type of method ( public Object getItem(int position) ) to String
public class MyAdapter3 extends ArrayAdapter {
    int resources;
    ArrayList<String> items = new ArrayList<>();
    Context context;

    public MyAdapter3(int resources, ArrayList<String> items, Context context) {
        super(context, resources, items);
        this.resources = resources;
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
        if(v==null){
            // You can use getContext
            v = LayoutInflater.from(context).inflate(R.layout.custom_row_item, null, false);
        }
        TextView tv = v.findViewById(R.id.custom_row_tv);
        tv.setText((String)getItem(position));
        return v;
    }
}
