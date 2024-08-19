package com.example.adapter_in_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.adapter_in_android.Adapters.MyAdapter6;
import com.example.adapter_in_android.Models.Cat;

import java.util.ArrayList;

public class Activity6 extends AppCompatActivity {
ArrayList<Cat> cats= new ArrayList<Cat>();
MyAdapter6 adapter6;
RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);

        cats.add(new Cat("Cat1",15));
        cats.add(new Cat("Cat1",15));
        cats.add(new Cat("Cat1",15));
        cats.add(new Cat("Cat1",15));
        cats.add(new Cat("Cat1",15));

        rv = findViewById(R.id.mani_rv6);

        adapter6 = new MyAdapter6(cats);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter6);
    }
}