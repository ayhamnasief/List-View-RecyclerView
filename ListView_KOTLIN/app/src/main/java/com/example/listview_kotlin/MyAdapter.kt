package com.example.listview_kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(context: Context, members:ArrayList<Member>) :
    ArrayAdapter<Member>(context, 0, members) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var view: View? = convertView
        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.row_item, parent, false)
        }
        var member: Member? = getItem(position)
        var iv_img:ImageView = view!!.findViewById(R.id.iv_img)
        var tv_name = view!!.findViewById<TextView>(R.id.tv_name)

        iv_img.setImageResource(member!!.img)
        tv_name.text = member.name

        return view
    }
}