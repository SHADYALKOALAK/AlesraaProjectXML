package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;

import com.example.alesraaprojectxml.databinding.ActivityFileScreenBinding;

import java.util.ArrayList;
import java.util.List;

public class FileScreen extends AppCompatActivity {
    private ActivityFileScreenBinding binding;
    private Context context = FileScreen.this;
    private List<CommentsModel> commentsModels;
    private Rc_Comment rc_comment;
    private DBase dataBase;
    private String name;


    @SuppressLint("Range")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFileScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        commentsModels = new ArrayList<>();
        dataBase = new DBase(context);
        rc_comment = new Rc_Comment(context, commentsModels);
        Cursor cursor = dataBase.getComment();
        while (cursor.moveToNext()) {
            @SuppressLint("Range") String comment = cursor.getString(cursor.getColumnIndex(cursor.getColumnName(1)));
            @SuppressLint("Range") String nameProfile = cursor.getString(cursor.getColumnIndex(cursor.getColumnName(2)));
            commentsModels.add(new CommentsModel(nameProfile, comment));
        }

        binding.rcComments.setAdapter(rc_comment);
        binding.rcComments.setLayoutManager(new LinearLayoutManager(context, RecyclerView.VERTICAL, false));
        Cursor user = dataBase.getUser();
        while (user.moveToNext()) {
            name = user.getString(user.getColumnIndex(DBase.COL_NAME));
        }
        binding.btnSend.setOnClickListener(v -> {
            String comment = binding.edComments.getText().toString().trim();
            if (comment.isEmpty()) {
                binding.edComments.setError("أضف تعليق من فضلك ");
            } else {
                commentsModels.add(new CommentsModel(name, comment));
                dataBase.insertComment(new CommentsModel(name, comment));
                binding.edComments.setText("");
                rc_comment.notifyDataSetChanged();
            }
        });
    }
}