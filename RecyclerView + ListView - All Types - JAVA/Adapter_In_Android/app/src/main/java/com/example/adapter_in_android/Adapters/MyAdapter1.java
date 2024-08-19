package com.example.adapter_in_android.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.adapter_in_android.R;

public class MyAdapter1 extends BaseAdapter {
    Context context;
    String[] items; // Data Source

    public MyAdapter1(Context context, String[] items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length; // Returns the number of items in your data source
    }

    @Override
    public Object getItem(int position) {
        return items[position]; // Returns the data item at the given position
    }

    @Override
    public long getItemId(int position) {
        return position; // Returns a unique Identifier for the item at the given position
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            // convertView: is a recycled View that you can reuse to
            //              improve the performance of your list.
            convertView = LayoutInflater.from(context).inflate(R.layout.custom_row_item, parent, false);
            holder = new ViewHolder();
            holder.tv = convertView.findViewById(R.id.custom_row_tv);
            convertView.setTag(holder);
        }else {
            // Reusing the View (that's recycled)
            holder = (ViewHolder) convertView.getTag();
        }
        // Set the data to the view
        holder.tv.setText(items[position]);

        // Binding data to views within the convertView
        return convertView; // Displays the data at a position in the data set
    }

    public static class ViewHolder{
        // Holds references to the views within an item layout
        TextView tv;
    }
}
