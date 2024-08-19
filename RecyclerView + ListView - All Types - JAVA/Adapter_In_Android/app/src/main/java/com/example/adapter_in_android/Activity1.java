package com.example.adapter_in_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.adapter_in_android.Adapters.MyAdapter1;

public class Activity1 extends AppCompatActivity {
    ListView lv1;
    MyAdapter1 adapter;
    String[] arr = new String[] {"Father", "Mother", "Son", "Daughter"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_adapter1);

        lv1 = findViewById(R.id.lv1);
        adapter = new MyAdapter1(this, arr);
        lv1.setAdapter(adapter);
    }
}