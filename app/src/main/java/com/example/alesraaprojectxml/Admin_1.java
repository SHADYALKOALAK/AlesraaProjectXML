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
            Intent facebook = new Intent();
            facebook.setAction(Intent.ACTION_VIEW);
            facebook.setData(Uri.parse("https:/www.youtube.com/watch?v=eLl-I9PwFyg"));
            startActivity(facebook);
        });

        binding.imageExportFile.setOnClickListener(v -> {
            startActivity(new Intent(context, UploodScreen.class));

        });
        binding.iconHomework.setOnClickListener(v -> {
            startActivity(new Intent(context, Comments_Screen.class));
        });
        binding.iconComment.setOnClickListener(v -> {
            startActivity(new Intent(context, CommentsAdmin.class));
        });
        binding.iconMassage.setOnClickListener(v -> {
            startActivity(new Intent(context, MassagesStudentWethAdmin.class));
        });

    }
}