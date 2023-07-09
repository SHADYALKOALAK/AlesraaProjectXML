package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alesraaprojectxml.databinding.ActivityElearningSBinding;

import java.util.ArrayList;

public class e_Learning extends AppCompatActivity {
    private Context context = e_Learning.this;
    private DBase dBase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityElearningSBinding binding;
        binding = ActivityElearningSBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        dBase = new DBase(context);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String id = intent.getStringExtra("id");
        binding.tvNameCourse.setText(name);
        binding.tvNumberOfCourse.setText(id);
        binding.iconArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, HomePageScreen.class));

            }
        });
        Cursor cursor = dBase.getComment();
        while (cursor.moveToNext()) {
            @SuppressLint("Range") String nameProfile = cursor.getString(cursor.getColumnIndex(cursor.getColumnName(2)));
            binding.tvName.setText(nameProfile);
        }
        binding.imageProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "الصفحة غير متوفرة الان", Toast.LENGTH_SHORT).show();
            }
        });
        binding.icNot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, Notices.class));
            }
        });
        binding.iconModel.setOnClickListener(v -> {
            Intent c = new Intent();
            c.setAction(Intent.ACTION_VIEW);
            c.setData(Uri.parse("https://student.israa.edu.ps"));
            startActivity(c);
        });
        binding.iconHomework.setOnClickListener(v -> {
            startActivity(new Intent(context, HomeWorkScreen.class));
        });
        binding.iconProfileScreen.setOnClickListener(v -> {
            Toast.makeText(context, "الصفحة غير متوفرة الان", Toast.LENGTH_SHORT).show();
        });
        binding.iconEducation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context, HomePageScreen.class));
            }
        });


    }

}