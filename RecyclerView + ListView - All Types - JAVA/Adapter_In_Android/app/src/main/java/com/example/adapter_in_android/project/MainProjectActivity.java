package com.example.adapter_in_android.project;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.adapter_in_android.R;

import java.util.ArrayList;

public class MainProjectActivity extends AppCompatActivity {
ArrayList<Post> posts = new ArrayList<>();
PostAdapter adapter;
ListView main_lv;
Button btn_add;
final int REQ_CODE_ADD = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_project);

        posts.add(new Post("12, May 2024", "Ayham Nassif", "Welcome to JAVA", 14, 25, 19));
        posts.add(new Post("12, May 2024", "Ayham Nassif", "Welcome to JAVA", 14, 25, 19));
        posts.add(new Post("12, May 2024", "Ayham Nassif", "Welcome to JAVA", 14, 25, 19));
        posts.add(new Post("12, May 2024", "Ayham Nassif", "Welcome to JAVA", 14, 25, 19));
        posts.add(new Post("12, May 2024", "Ayham Nassif", "Welcome to JAVA", 14, 25, 19));

        main_lv = findViewById(R.id.main_lv);
        btn_add = findViewById(R.id.btn_add);

        adapter = new PostAdapter(R.layout.custom_post_layout, this, posts);

        main_lv.setAdapter(adapter);



        ActivityResultLauncher<Intent> arl = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if(result.getResultCode() == RESULT_OK){
                            Post p = (Post) result.getData().getSerializableExtra("post");
                            adapter.addItem(p);

                        }
                    }
                }
        );

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                arl.launch(new Intent(getBaseContext(), AddPostActivity.class));
            }
        });
    }
}