package com.example.adapter_in_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class BasicAdapter extends AppCompatActivity {

    ListView lv;
    ArrayAdapter<String> adapter;
    // OR
    ArrayList<String> familyMembers = new ArrayList<>();
    String[] arr = new String[] {"Father", "Mother", "Son", "Daughter"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_adapter);
        familyMembers.add("Father");
        familyMembers.add("Mother");
        familyMembers.add("Son");
        familyMembers.add("Daughter");

        lv = findViewById(R.id.main_lv);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);

        lv.setAdapter(adapter);

    }
}