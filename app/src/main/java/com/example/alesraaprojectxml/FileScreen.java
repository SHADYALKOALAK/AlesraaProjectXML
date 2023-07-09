package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.alesraaprojectxml.databinding.ActivityFileScreenBinding;

import java.util.ArrayList;
import java.util.List;

public class FileScreen extends AppCompatActivity {
    private ActivityFileScreenBinding binding;
    private Context context = FileScreen.this;
    private List<CommentsModel> commentsModels;
    private Rc_Comment rc_comment;
    private DataBase dataBase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFileScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        commentsModels = new ArrayList<>();
        dataBase = new DataBase(context);
        rc_comment = new Rc_Comment(context, commentsModels);

        commentsModels.add(new CommentsModel(" هدية خليل مقاط /", "يعطيك ألف عافية دكتور"));
        commentsModels.add(new CommentsModel("دانية محمود نصر/", "يعطيك ألف عافية دكتور , تم تسليم الواجب"));
        commentsModels.add(new CommentsModel("دانية محمود نصر/", "يعطيك ألف عافية دكتور , تم تسليم الواجب"));
        binding.rcComments.setAdapter(rc_comment);
        binding.rcComments.setLayoutManager(new LinearLayoutManager(context, RecyclerView.VERTICAL, false));
        binding.btnSend.setOnClickListener(v -> {
            String comment = binding.edComments.getText().toString().trim();
            if (comment.isEmpty()) {
                binding.edComments.setError("أضف تعليق من فضلك ");
            } else {
                commentsModels.add(new CommentsModel(comment));
                binding.edComments.setText("");
                dataBase.insertComment(new CommentsModel(comment));
                rc_comment.notifyDataSetChanged();
            }
        });
    }
}