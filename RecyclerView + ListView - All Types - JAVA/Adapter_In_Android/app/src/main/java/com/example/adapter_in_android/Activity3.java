package com.example.adapter_in_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.adapter_in_android.Adapters.MyAdapter3;

import java.util.ArrayList;

public class Activity3 extends AppCompatActivity {
ListView lv3;
ArrayList<String> items = new ArrayList<>();
MyAdapter3 adapter3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        items.add("Father");
        items.add("Mother");
        items.add("Son");
        items.add("Daughter");

        lv3 = findViewById(R.id.lv3);

        adapter3 = new MyAdapter3(R.layout.custom_row_item, items, this);

        lv3.setAdapter(adapter3);
        
        lv3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // I can get item:
                // 1): items.get(position)
                // 2): String name = (String)adapter3.getItem(position);
                // 3): String name = (String)parent.getItemAtPosition(position);
                Toast.makeText(Activity3.this, position+ ": "+items.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}