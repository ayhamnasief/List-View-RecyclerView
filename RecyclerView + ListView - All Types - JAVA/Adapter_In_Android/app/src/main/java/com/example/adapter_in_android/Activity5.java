package com.example.adapter_in_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.adapter_in_android.Adapters.MyAdapter5;
import com.example.adapter_in_android.Models.Item;

import java.util.ArrayList;

public class Activity5 extends AppCompatActivity {
MyAdapter5 adapter5;
RecyclerView rv;
ArrayList<Item> items = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        items.add(new Item("1"));
        items.add(new Item("1"));
        items.add(new Item("1"));
        items.add(new Item("1"));
        items.add(new Item("1"));

        rv = findViewById(R.id.rv5);

        adapter5 = new MyAdapter5(items);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter5);

    }
}