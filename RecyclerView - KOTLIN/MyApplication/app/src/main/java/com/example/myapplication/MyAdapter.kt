package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(var myHandler: MyHandler) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    var chatSms: ArrayList<Chat> = ArrayList()

    fun setChatSms(chat:Chat){
        this.chatSms.add(chat)
        notifyDataSetChanged()
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var row_item_tv_usr:TextView = itemView.findViewById(R.id.row_item_tv_usr)
        var row_item_tv_sms:TextView = itemView.findViewById(R.id.row_item_tv_sms)
        fun bind(chatSms:Chat){
            row_item_tv_usr.text = chatSms.usr
            row_item_tv_sms.text = chatSms.sms
            itemView.setOnClickListener{
                myHandler.handlerMethod(chatSms)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view:View = LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return chatSms.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var chatSms:Chat = chatSms.get(position)
        holder.bind(chatSms)
    }
}