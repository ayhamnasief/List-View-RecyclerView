package com.example.rv_java.project2;

import android.os.Bundle;
import android.widget.Toast;

import com.example.rv_java.Member;
import com.example.rv_java.R;
import com.example.rv_java.RV_Handler;
import com.example.rv_java.prohect1.Activity1;
import com.example.rv_java.prohect1.MyAdapter1;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rv_java.databinding.Activity2Binding;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity implements RV_Handler {

    ArrayList<Member> members;
    MyAdapter2 adapter2;
    RecyclerView rv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        rv2 = findViewById(R.id.rv2);

        members = new ArrayList<>();
        members.add(new Member("Jack", android.R.drawable.ic_menu_my_calendar));
        members.add(new Member("John", android.R.drawable.ic_menu_my_calendar));
        members.add(new Member("Paul", android.R.drawable.ic_menu_my_calendar));
        members.add(new Member("Mike", android.R.drawable.ic_menu_my_calendar));

        adapter2 = new MyAdapter2(members, this);

        rv2.setAdapter(adapter2);
        rv2.setLayoutManager(new LinearLayoutManager(this));
        rv2.setHasFixedSize(true);
    }

    @Override
    public void handlerMethod(Member member) {
        Toast.makeText(Activity2.this, "Hi: "+ member.getName(), Toast.LENGTH_SHORT).show();
    }
}