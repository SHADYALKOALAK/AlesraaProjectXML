package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import com.example.alesraaprojectxml.databinding.ActivityViedoScreenBinding;

import java.util.ArrayList;
import java.util.List;

public class ViedoScreen extends AppCompatActivity {
    private ActivityViedoScreenBinding binding;
    private Context context = ViedoScreen.this;
    private List<CommentsModel> commentsModels;
    private Rc_Comment rc_comment;
    private DataBase dataBase;

    @SuppressLint("Range")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityViedoScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Cursor cursor=dataBase.getComment();
        while (cursor.moveToNext()){
            if (cursor.moveToNext()){
                String comments=cursor.getString(cursor.getColumnIndex(DataBase.COL_COMMENT));
                commentsModels.add(new CommentsModel(comments));
            }

        }

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
                dataBase.insertComment(new CommentsModel(comment));
                rc_comment.notifyDataSetChanged();



            }
        });
    }
}