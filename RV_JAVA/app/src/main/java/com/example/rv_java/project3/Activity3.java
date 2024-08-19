package com.example.rv_java.project3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.rv_java.Member;
import com.example.rv_java.R;
import com.example.rv_java.RV_Handler;
import com.example.rv_java.project2.Activity2;
import com.example.rv_java.project2.MyAdapter2;

import java.util.ArrayList;

public class Activity3 extends AppCompatActivity implements RV_Handler {

    ArrayList<Member> members;
    MyAdapter3 adapter3;
    RecyclerView rv3;
    Button btn_add;
    EditText et_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        rv3 = findViewById(R.id.rv3);
        btn_add = findViewById(R.id.btn_add);
        et_name = findViewById(R.id.et_name);

        adapter3 = new MyAdapter3( this);

        rv3.setAdapter(adapter3);
        rv3.setLayoutManager(new LinearLayoutManager(this));
        rv3.setHasFixedSize(true);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter3.setMembers(new Member(et_name.getText().toString(), android.R.drawable.ic_menu_my_calendar));
                et_name.setText("");
            }
        });
    }

    @Override
    public void handlerMethod(Member member) {
        Toast.makeText(Activity3.this, "Hi: "+ member.getName(), Toast.LENGTH_SHORT).show();
    }
}