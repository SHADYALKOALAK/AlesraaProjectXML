package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.alesraaprojectxml.databinding.ActivityWelcomeScreen3Binding;

public class WelcomeScreen3 extends AppCompatActivity {
    private ActivityWelcomeScreen3Binding binding;
    private Context context = WelcomeScreen3.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWelcomeScreen3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvSkip.setOnClickListener(v -> {
            startActivity(new Intent(context, WelcomeScreen4.class));
        });

    }
}