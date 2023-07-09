package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.alesraaprojectxml.databinding.ActivityCommentsAdminBinding;

import java.util.ArrayList;

public class CommentsAdmin extends AppCompatActivity {
    Context context=CommentsAdmin.this;
    ArrayList<ItemCommentsAdmin> arrayList;
    AdapterCommentsAdmin adapterCommentsAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCommentsAdminBinding binding;
        binding=ActivityCommentsAdminBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        arrayList=new ArrayList<>();
        arrayList.add(new ItemCommentsAdmin("Baraa","this is my comments"));
        arrayList.add(new ItemCommentsAdmin("Baraa","this is my comments"));
        arrayList.add(new ItemCommentsAdmin("Baraa","this is my comments"));
        arrayList.add(new ItemCommentsAdmin("Baraa","this is my comments"));
        arrayList.add(new ItemCommentsAdmin("Baraa","this is my comments"));
        arrayList.add(new ItemCommentsAdmin("Baraa","this is my comments"));
        arrayList.add(new ItemCommentsAdmin("Baraa","this is my comments"));
        adapterCommentsAdmin=new AdapterCommentsAdmin(context,arrayList);
        binding.rv.setAdapter(adapterCommentsAdmin);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(context);
        binding.rv.setLayoutManager(linearLayoutManager);


        binding.iconHomework.setOnClickListener(v -> {
            startActivity(new Intent(context, Comments_Screen.class));
        });
        binding.iconMassage.setOnClickListener(v -> {
            startActivity(new Intent(context, MassagesStudentWethAdmin.class));
        });

    }
}