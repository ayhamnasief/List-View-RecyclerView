package com.example.adapter_in_android.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.adapter_in_android.R;

import java.util.ArrayList;

public class MyAdapter4 extends ArrayAdapter<String> {

    ArrayList<String> items = new ArrayList<>();
    Context context;
    int resources;

    public MyAdapter4(ArrayList<String> items, Context context, int resources) {
        super(context, resources, items);
        this.items = items;
        this.context = context;
        this.resources = resources;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Nullable
    @Override
    public String getItem(int position) {
        return items.get(position);
    }

    public void setItem(int pos, String item){
        items.set(pos, item);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        if(v==null){
            v = LayoutInflater.from(getContext()).inflate(resources, null, false);
        }
        TextView tv = v.findViewById(R.id.custom_row_tv);
        tv.setText(getItem(position));
        return v;
    }
}
