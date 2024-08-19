package com.example.adapter_in_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.adapter_in_android.Adapters.MyAdapter3;
import com.example.adapter_in_android.Adapters.MyAdapter4;

import java.util.ArrayList;

public class Activity4 extends AppCompatActivity {
    int currentPosition = -1;
    ListView lv4;
    EditText et4;
    Button btn4;
    ArrayList<String> items = new ArrayList<>();
    MyAdapter4 adapter4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        lv4 = findViewById(R.id.lv4);
        et4 = findViewById(R.id.et4);
        btn4 = findViewById(R.id.btn4);

        adapter4 = new MyAdapter4(items, this, R.layout.custom_row_item);

        lv4.setAdapter(adapter4);


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentPosition >=0){
                    // Update
                    String item = et4.getText().toString();
                    adapter4.setItem(currentPosition,item);
                    Toast.makeText(Activity4.this, currentPosition +" : "+ item, Toast.LENGTH_SHORT).show();
                    currentPosition = -1;
                } else {
                    //Add
                    String name = et4.getText().toString();
                    if(name !=null){
                        items.add(name);
                        et4.setText("");
                    }
                }
                adapter4.notifyDataSetChanged();
            }
        });

        lv4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                currentPosition = position;
                et4.setText(items.get(position));
            }
        });
    }
}