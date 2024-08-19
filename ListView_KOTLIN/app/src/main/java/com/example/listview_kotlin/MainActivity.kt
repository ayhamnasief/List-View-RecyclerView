package com.example.listview_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var members:ArrayList<Member> = ArrayList()

    lateinit var lv:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lv = findViewById(R.id.lv)

        members.add(Member("Jack", R.drawable.ic_launcher_foreground))
        members.add(Member("Mike", R.drawable.ic_launcher_foreground))
        members.add(Member("Paul", R.drawable.ic_launcher_foreground))
        members.add(Member("John", R.drawable.ic_launcher_foreground))

        var adapter:MyAdapter = MyAdapter(this, members)

        lv.adapter = adapter

        lv.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(applicationContext, "Hi: " + members.get(position).name,Toast.LENGTH_LONG).show()
        }





    }
}