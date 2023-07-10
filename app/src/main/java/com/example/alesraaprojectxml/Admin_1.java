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




        binding.iconHomework.setOnClickListener(v -> {
            startActivity(new Intent(context, Comments_Screen.class));
        });
        binding.iconComment.setOnClickListener(v -> {
            startActivity(new Intent(context, CommentsAdmin.class));
        });
        binding.iconMassage.setOnClickListener(v -> {
            startActivity(new Intent(context, MassagesStudentWethAdmin.class));
        });
        binding.imageExportFile.setOnClickListener(v -> {
            Intent intent = new Intent(context, UploodScreen.class);
            intent.putExtra("flag",1);
            startActivity(intent);

        });
        binding.imagePost.setOnClickListener(v -> {
            Intent intent = new Intent(context, UploodScreen.class);
            intent.putExtra("flag",2);
            startActivity(intent);

        });
        binding.imageHomework.setOnClickListener(v -> {
            Intent intent = new Intent(context, UploodScreen.class);
            intent.putExtra("flag",3);
            startActivity(intent);

        });
        binding.imageSpeacke.setOnClickListener(v -> {
            Intent intent = new Intent(context, UploodScreen.class);
            intent.putExtra("flag",4);
            startActivity(intent);

        });
        binding.imageVideo.setOnClickListener(v -> {
            Intent intent = new Intent(context, UploodScreen.class);
            intent.putExtra("flag",5);
            startActivity(intent);
        });
    }
}