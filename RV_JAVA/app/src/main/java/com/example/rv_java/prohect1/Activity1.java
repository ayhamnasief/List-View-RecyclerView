package com.example.rv_java.prohect1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.rv_java.Member;
import com.example.rv_java.R;
import com.example.rv_java.RV_Handler;

import java.util.ArrayList;

public class Activity1 extends AppCompatActivity {

    ArrayList<Member> members;
    MyAdapter1 adapter1;
    RecyclerView rv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        rv1 = findViewById(R.id.rv1);

        members = new ArrayList<>();
        members.add(new Member("Jack", android.R.drawable.ic_menu_my_calendar));
        members.add(new Member("John", android.R.drawable.ic_menu_my_calendar));
        members.add(new Member("Paul", android.R.drawable.ic_menu_my_calendar));
        members.add(new Member("Mike", android.R.drawable.ic_menu_my_calendar));

        adapter1 = new MyAdapter1(members, new RV_Handler() {
            @Override
            public void handlerMethod(Member member) {
                Toast.makeText(Activity1.this, "Hi: "+ member.getName(), Toast.LENGTH_SHORT).show();
            }
        });

        rv1.setAdapter(adapter1);
        rv1.setLayoutManager(new LinearLayoutManager(this));
        rv1.setHasFixedSize(true);
    }
}