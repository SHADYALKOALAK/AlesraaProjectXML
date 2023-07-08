package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.alesraaprojectxml.databinding.WelcomeScreen1Binding;


public class Welcome_screen1 extends AppCompatActivity {
    private WelcomeScreen1Binding binding;
    private Context context = Welcome_screen1.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = WelcomeScreen1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.tvSkip.setOnClickListener(v -> {
            startActivity(new Intent(context, HomePageScreen.class));
        });


    }
}