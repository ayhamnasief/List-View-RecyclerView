package com.example.adapter_in_android.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.adapter_in_android.R;

import java.util.ArrayList;

public class PostAdapter extends BaseAdapter {

    int resources;
    Context context;
    ArrayList<Post> posts;

    public PostAdapter(int resources, Context context, ArrayList<Post> posts) {
        this.resources = resources;
        this.context = context;
        this.posts = posts;
    }

    @Override
    public int getCount() {
        return posts.size();
    }

    @Override
    public Post getItem(int position) {
        return posts.get(position);
    }

    public void addItem(Post post){
        this.posts.add(post);
        notifyDataSetChanged();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(v==null){
            v = LayoutInflater.from(context).inflate(R.layout.custom_post_layout, null, false);
        }
        TextView tv_date = v.findViewById(R.id.custom_post_tv_date);
        TextView tv_name = v.findViewById(R.id.custom_post_tv_name);
        TextView tv_following = v.findViewById(R.id.custom_post_tv_following_data);
        TextView tv_followers = v.findViewById(R.id.custom_post_tv_followers_data);
        TextView tv_posts = v.findViewById(R.id.custom_post_tv_post_data);
        TextView tv_body = v.findViewById(R.id.custom_post_tv_body);

        Post p = getItem(position);
        tv_date.setText(p.getData());
        tv_name.setText(p.getName());
        tv_following.setText(p.getFollowing()+"");
        tv_followers.setText(p.getFollowers()+"");
        tv_posts.setText(p.getPosts()+"");
        tv_body.setText(p.getBody());

        return v;
    }
}
