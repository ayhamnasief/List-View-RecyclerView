package com.example.adapter_in_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.adapter_in_android.project.MainProjectActivity;

public class MainActivity extends AppCompatActivity {
TextView main_tv;
TextView main_tv1;
TextView main_tv2;
TextView main_tv3;
TextView main_tv4;
TextView main_tv5;
TextView main_tv6;
TextView main_tv7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_tv = findViewById(R.id.main_tv);
        main_tv1 = findViewById(R.id.main_tv1);
        main_tv2 = findViewById(R.id.main_tv2);
        main_tv3 = findViewById(R.id.main_tv3);
        main_tv4 = findViewById(R.id.main_tv4);
        main_tv5 = findViewById(R.id.main_tv5);
        main_tv6 = findViewById(R.id.main_tv6);
        main_tv7 = findViewById(R.id.main_tv7);

        main_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BasicAdapter.class);
                startActivity(intent);
            }
        });

        main_tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity1.class);
                startActivity(intent);
            }
        });

        main_tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        });

        main_tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity3.class);
                startActivity(intent);
            }
        });

        main_tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity4.class);
                startActivity(intent);
            }
        });

        main_tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity5.class);
                startActivity(intent);
            }
        });

        main_tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity6.class);
                startActivity(intent);
            }
        });

        main_tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainProjectActivity.class);
                startActivity(intent);
            }
        });
    }
}