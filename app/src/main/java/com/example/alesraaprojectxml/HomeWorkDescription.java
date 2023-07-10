package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import com.example.alesraaprojectxml.databinding.ActivityHomeWorkDescriptionBinding;

import java.util.ArrayList;

public class HomeWorkDescription extends AppCompatActivity {
    private ArrayList<ItemRvHomeWork> arrayList;
    Context context=HomeWorkDescription.this;
    AdapterHomeWorkScreen adapter;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityHomeWorkDescriptionBinding binding;
        binding=ActivityHomeWorkDescriptionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        arrayList=new ArrayList<>();
        arrayList.add(new ItemRvHomeWork("Baraa","10"));
        arrayList.add(new ItemRvHomeWork("Baraa","5"));
        arrayList.add(new ItemRvHomeWork("Baraa","9"));
        arrayList.add(new ItemRvHomeWork("Baraa","10"));
        arrayList.add(new ItemRvHomeWork("Baraa","10"));
        arrayList.add(new ItemRvHomeWork("Baraa","10"));

        adapter=new AdapterHomeWorkScreen(arrayList,context);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(context);
        binding.rv.setAdapter(adapter);
        binding.rv.setLayoutManager(linearLayoutManager);






    }

}