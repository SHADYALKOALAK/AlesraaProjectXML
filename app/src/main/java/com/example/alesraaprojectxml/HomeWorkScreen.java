package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.alesraaprojectxml.databinding.ActivityHomeWorkScreenBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeWorkScreen extends AppCompatActivity {
    private ActivityHomeWorkScreenBinding binding;
    private Context context = HomeWorkScreen.this;
    private List<CommentsModel> commentsModels;
    private Rc_Comment rc_comment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeWorkScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        commentsModels = new ArrayList<>();
        rc_comment = new Rc_Comment(context, commentsModels);

        commentsModels.add(new CommentsModel(" هدية خليل مقاط /", "يعطيك ألف عافية دكتور"));
        commentsModels.add(new CommentsModel("دانية محمود نصر/", "يعطيك ألف عافية دكتور , تم تسليم الواجب"));
        commentsModels.add(new CommentsModel("دانية محمود نصر/", "يعطيك ألف عافية دكتور , تم تسليم الواجب"));

        binding.rcComments.setAdapter(rc_comment);
        binding.rcComments.setLayoutManager(new LinearLayoutManager(context, RecyclerView.VERTICAL, false));

        binding.iconArrow.setOnClickListener(v -> {
            finish();
        });
        binding.icNot.setOnClickListener(v -> {
            startActivity(new Intent(context, Notices.class));
        });
        binding.imageProfile.setOnClickListener(v -> {
            Toast.makeText(context, "الصفحة غير متوفرة الان", Toast.LENGTH_SHORT).show();
        });
        binding.iconProfileScreen.setOnClickListener(v -> {
            Toast.makeText(context, "الصفحة غير متوفرة الان", Toast.LENGTH_SHORT).show();
        });
        binding.iconEducation.setOnClickListener(v -> {
            startActivity(new Intent(context, HomePageScreen.class));
        });
        binding.iconModel.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://ar.israa.edu.ps"));
            startActivity(intent);
        });
        binding.btnSend1.setOnClickListener(v -> {
            String comment = binding.edComments.getText().toString().trim();
            if (comment.isEmpty()) {
                binding.edComments.setError("أضف تعليق من فضلك ");
            } else {
                commentsModels.add(new CommentsModel(comment));
                binding.edComments.setText("");
                rc_comment.notifyDataSetChanged();
            }

        });

    }
}