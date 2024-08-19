package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity(), MyHandler {

    lateinit var usr:String
    lateinit var rv:RecyclerView
    lateinit var et_sms:EditText
    lateinit var btn_send:Button
    lateinit var adapter:MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        if(intent !=null){
            this.usr = intent.extras!!.getString("usr").toString()
            Toast.makeText(this, "Hi: "+usr.toString(), Toast.LENGTH_LONG).show()
        }

        rv = findViewById(R.id.rv)
        et_sms = findViewById(R.id.et_sms)
        btn_send = findViewById(R.id.btn_send)

        adapter = MyAdapter(this)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(this)
        rv.setHasFixedSize(true)

        btn_send.setOnClickListener {
            adapter.setChatSms(Chat(usr, et_sms.text.toString()))
            et_sms.setText("")
        }

    }

    override fun handlerMethod(chat: Chat) {
        Toast.makeText(this, chat.sms, Toast.LENGTH_LONG).show()
    }
}