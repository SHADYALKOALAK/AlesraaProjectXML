package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.alesraaprojectxml.databinding.ActivityDiscussionScreenBinding;

import java.util.ArrayList;
import java.util.List;

public class DiscussionScreen extends AppCompatActivity {
    private ActivityDiscussionScreenBinding binding;
    private Context context = DiscussionScreen.this;
    private List<CommentsModel> commentsModels;
    private Rc_Comment rc_comment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDiscussionScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        commentsModels = new ArrayList<>();
        rc_comment = new Rc_Comment(context, commentsModels);

        commentsModels.add(new CommentsModel(" هدية خليل مقاط /","يعطيك ألف عافية دكتور"));
        commentsModels.add(new CommentsModel("دانية محمود نصر/","يعطيك ألف عافية دكتور , تم تسليم الواجب"));
        commentsModels.add(new CommentsModel("دانية محمود نصر/","يعطيك ألف عافية دكتور , تم تسليم الواجب"));

        binding.rcComments.setAdapter(rc_comment);
        binding.rcComments.setLayoutManager(new LinearLayoutManager(context, RecyclerView.VERTICAL,false));
    }
}