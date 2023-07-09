package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import com.example.alesraaprojectxml.databinding.ActivityHomeWorkDescriptionBinding;

public class HomeWorkDescription extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityHomeWorkDescriptionBinding binding;
        binding=ActivityHomeWorkDescriptionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


    }

}