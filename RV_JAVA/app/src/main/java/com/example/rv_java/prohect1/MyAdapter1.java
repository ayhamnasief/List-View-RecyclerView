package com.example.rv_java.prohect1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rv_java.Member;
import com.example.rv_java.R;
import com.example.rv_java.RV_Handler;

import java.util.ArrayList;

public class MyAdapter1 extends RecyclerView.Adapter<MyAdapter1.MyViewHolder1> {
    ArrayList<Member> members = new ArrayList<>();
    RV_Handler rvHandler;

    public MyAdapter1(ArrayList<Member> members, RV_Handler rvHandler) {
        this.members = members;
        this.rvHandler = rvHandler;
    }

    @NonNull
    @Override
    public MyViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        return new MyViewHolder1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder1 holder, int position) {
        Member member = members.get(position);
        holder.bind(member);
    }

    @Override
    public int getItemCount() {
        return members.size();
    }

    public class MyViewHolder1 extends RecyclerView.ViewHolder {
        TextView row_item_tv;
        ImageView row_item_img;
        View v;

        public MyViewHolder1(@NonNull View itemView) {
            super(itemView);
            v = itemView;
            row_item_img = itemView.findViewById(R.id.row_item_img);
            row_item_tv = itemView.findViewById(R.id.row_item_tv);
        }

        void bind(Member member){
            row_item_img.setImageResource(member.getImg());
            row_item_tv.setText(member.getName());
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rvHandler.handlerMethod(member);
                }
            });
        }
    }
}
