package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.alesraaprojectxml.databinding.ActivityAdmin1Binding;

public class Admin_1 extends AppCompatActivity {
    private ActivityAdmin1Binding binding;
    private Context context = Admin_1.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAdmin1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imageVideo.setOnClickListener(v -> {

        });

        binding.imageExportFile.setOnClickListener(v -> {

        });
    }
}