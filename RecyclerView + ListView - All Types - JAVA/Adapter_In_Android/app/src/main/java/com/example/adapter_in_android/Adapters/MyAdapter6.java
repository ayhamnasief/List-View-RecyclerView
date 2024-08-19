package com.example.adapter_in_android.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.adapter_in_android.Models.Cat;
import com.example.adapter_in_android.R;

import java.util.ArrayList;

public class MyAdapter6 extends RecyclerView.Adapter<MyAdapter6.CatViewHolder> {
    ArrayList<Cat> cats = new ArrayList<>();

    public MyAdapter6(ArrayList<Cat> cats) {
        this.cats = cats;
    }

    @NonNull
    @Override
    public CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_row_cat, null, false);
        CatViewHolder vh = new CatViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull CatViewHolder holder, int position) {
        Cat cat = cats.get(position);
        holder.catName.setText(cat.getName());
        holder.catWeight.setText(cat.getWeight()+"");
    }

    @Override
    public int getItemCount() {
        return cats.size();
    }


    class CatViewHolder extends RecyclerView.ViewHolder{
        TextView catWeight;
        TextView catName;
        public CatViewHolder(@NonNull View itemView) {
            super(itemView);
            catName = itemView.findViewById(R.id.custom_tv_cat_name);
            catWeight = itemView.findViewById(R.id.custom_tv_cat_weight);
        }
    }
}
