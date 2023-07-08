package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.alesraaprojectxml.databinding.ActivityWelcomeScreen2Binding;

public class WelcomeScreen2 extends AppCompatActivity {
    private ActivityWelcomeScreen2Binding binding;
    private Context context =WelcomeScreen2.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWelcomeScreen2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.tvSkip.setOnClickListener(v -> {
            startActivity(new Intent(context, WelcomeScreen3.class));
        });

    }
}