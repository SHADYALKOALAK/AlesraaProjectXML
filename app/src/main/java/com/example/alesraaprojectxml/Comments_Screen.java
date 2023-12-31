package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;

import com.example.alesraaprojectxml.databinding.ActivityCommentsScreenBinding;

import java.util.ArrayList;

public class Comments_Screen extends AppCompatActivity implements AdapterHomeWorkExport.ViewHandle_inter {
    private ArrayList<ItemRvHomeWorkExport> arrayList;
    private Context context = Comments_Screen.this;
    private AdapterHomeWorkExport adapterHomeWorkExport;
    private DBase dBase;
    private String nameProfile;
    private AdapterHomeWorkExport.ViewHandle_inter viewHandle_inter;



    @SuppressLint("Range")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCommentsScreenBinding binding;
        binding = ActivityCommentsScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        arrayList = new ArrayList<>();
        dBase = new DBase(context);
//        arrayList.add(new ItemRvHomeWorkExport("Baraa Mohammad", "java"));
//        arrayList.add(new ItemRvHomeWorkExport("Baraa Mohammad", "java"));
//        arrayList.add(new ItemRvHomeWorkExport("Baraa Mohammad", "java"));
//        arrayList.add(new ItemRvHomeWorkExport("Baraa Mohammad", "java"));
//        arrayList.add(new ItemRvHomeWorkExport("Baraa Mohammad", "java"));
//        arrayList.add(new ItemRvHomeWorkExport("Baraa Mohammad", "java"));
//        arrayList.add(new ItemRvHomeWorkExport("Baraa Mohammad", "java"));
//        arrayList.add(new ItemRvHomeWorkExport("Baraa Mohammad", "java"));
//        arrayList.add(new ItemRvHomeWorkExport("Baraa Mohammad", "java"));
        adapterHomeWorkExport = new AdapterHomeWorkExport(context, arrayList,viewHandle_inter);
        binding.rv.setAdapter(adapterHomeWorkExport);
        binding.rv.setLayoutManager(new LinearLayoutManager(context));
        Cursor name = dBase.getComment();
        while (name.moveToNext()) {
            nameProfile = name.getString(name.getColumnIndex(name.getColumnName(2)));
        }

        Cursor filePath = dBase.getPathFile();
        while (filePath.moveToNext()) {
            @SuppressLint("Range") String path = filePath.getString(filePath.getColumnIndex(filePath.getColumnName(1)));
            arrayList.add(new ItemRvHomeWorkExport(nameProfile, path));
        }


        binding.iconComment.setOnClickListener(v -> {
            startActivity(new Intent(context, CommentsAdmin.class));
        });
        binding.iconMassage.setOnClickListener(v -> {
            startActivity(new Intent(context, MassagesStudentWethAdmin.class));
        });



    }

    @Override
    public void ClickHandle(int pos) {








    }
}