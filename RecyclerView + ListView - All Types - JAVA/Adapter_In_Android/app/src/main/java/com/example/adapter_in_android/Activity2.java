package com.example.adapter_in_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.adapter_in_android.Adapters.MyAdapter2;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {
ListView lv2;
ArrayList<String> items = new ArrayList<>();
MyAdapter2 adapter2;

EditText et2;
Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_adapter2);

        items.add("Father");
        items.add("Mother");
        items.add("Son");
        items.add("Daughter");

        lv2 = findViewById(R.id.lv2);
        et2 = findViewById(R.id.et2);
        btn2 = findViewById(R.id.btn2);

        adapter2 = new MyAdapter2(R.layout.custom_row_item, items, this);

        lv2.setAdapter(adapter2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newMember = et2.getText().toString();
                if(newMember !=null){
                    items.add(et2.getText().toString());
                    adapter2.notifyDataSetChanged();
                    et2.setText("");
                }
            }
        });
    }
}