package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.alesraaprojectxml.databinding.ActivityElearningSBinding;

import java.util.ArrayList;

public class e_Learning extends AppCompatActivity {
    private Context context = e_Learning.this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityElearningSBinding binding;
        binding = ActivityElearningSBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String id = intent.getStringExtra("id");
        binding.tvNameCourse.setText(name);
        binding.tvNumberOfCourse.setText(id);




    }

}