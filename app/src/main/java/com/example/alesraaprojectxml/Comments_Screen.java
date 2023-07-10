package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.alesraaprojectxml.databinding.ActivityCommentsScreenBinding;

import java.util.ArrayList;

public class Comments_Screen extends AppCompatActivity {
    ArrayList<ItemRvHomeWorkExport> arrayList;
    Context context=Comments_Screen.this;
    AdapterHomeWorkExport adapterHomeWorkExport;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCommentsScreenBinding binding;
        binding=ActivityCommentsScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        arrayList=new ArrayList<>();
        arrayList.add(new ItemRvHomeWorkExport("Baraa Mohammad","java"));
        arrayList.add(new ItemRvHomeWorkExport("Baraa Mohammad","java"));
        arrayList.add(new ItemRvHomeWorkExport("Baraa Mohammad","java"));
        arrayList.add(new ItemRvHomeWorkExport("Baraa Mohammad","java"));
        arrayList.add(new ItemRvHomeWorkExport("Baraa Mohammad","java"));
        arrayList.add(new ItemRvHomeWorkExport("Baraa Mohammad","java"));
        arrayList.add(new ItemRvHomeWorkExport("Baraa Mohammad","java"));
        arrayList.add(new ItemRvHomeWorkExport("Baraa Mohammad","java"));
        arrayList.add(new ItemRvHomeWorkExport("Baraa Mohammad","java"));
        adapterHomeWorkExport=new AdapterHomeWorkExport(context,arrayList);
        binding.rv.setAdapter(adapterHomeWorkExport);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(context);
        binding.rv.setLayoutManager(linearLayoutManager);


//
        binding.iconComment.setOnClickListener(v -> {
            startActivity(new Intent(context, CommentsAdmin.class));
        });
        binding.iconMassage.setOnClickListener(v -> {
            startActivity(new Intent(context, MassagesStudentWethAdmin.class));
        });





    }
}