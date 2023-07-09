package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.alesraaprojectxml.databinding.ActivityElearningSBinding;

import java.util.ArrayList;

public class e_Learning extends AppCompatActivity implements Rc_courses.Handle {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityElearningSBinding binding;
        binding = ActivityElearningSBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        String name=intent.getStringExtra("name");
        String id=intent.getStringExtra("id");
        binding.tvNameCourse.setText(name);
        binding.tvNumberOfCourse.setText(id);

    }


    @Override
    public void clickHandle(int position, String nameCourse, String idCourse) {


    }
}