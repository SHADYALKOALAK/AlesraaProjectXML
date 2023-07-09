package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Context;
import android.os.Bundle;

import com.example.alesraaprojectxml.databinding.ActivityMassagesStudentWethAdminBinding;

import java.util.ArrayList;

public class MassagesStudentWethAdmin extends AppCompatActivity {
    ArrayList<ItemMassageStudentWithAdmin> arrayList;
    Context context= MassagesStudentWethAdmin.this;
    AdapterMassageStudentWithAdmin adapterMassageStudentWithAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMassagesStudentWethAdminBinding binding;
        binding=ActivityMassagesStudentWethAdminBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        arrayList=new ArrayList<>();
        arrayList.add(new ItemMassageStudentWithAdmin("Baraa Mohammad","this is title massage","this is massage text"));
        arrayList.add(new ItemMassageStudentWithAdmin("Baraa Mohammad","this is title massage","this is massage text"));
        arrayList.add(new ItemMassageStudentWithAdmin("Baraa Mohammad","this is title massage","this is massage text"));
        arrayList.add(new ItemMassageStudentWithAdmin("Baraa Mohammad","this is title massage","this is massage text"));
        arrayList.add(new ItemMassageStudentWithAdmin("Baraa Mohammad","this is title massage","this is massage text"));
        arrayList.add(new ItemMassageStudentWithAdmin("Baraa Mohammad","this is title massage","this is massage text"));
        arrayList.add(new ItemMassageStudentWithAdmin("Baraa Mohammad","this is title massage","this is massage text"));
        arrayList.add(new ItemMassageStudentWithAdmin("Baraa Mohammad","this is title massage","this is massage text"));
        arrayList.add(new ItemMassageStudentWithAdmin("Baraa Mohammad","this is title massage","this is massage text"));
        arrayList.add(new ItemMassageStudentWithAdmin("Baraa Mohammad","this is title massage","this is massage text"));
        adapterMassageStudentWithAdmin=new AdapterMassageStudentWithAdmin(arrayList,context);
        binding.rv.setAdapter(adapterMassageStudentWithAdmin);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(context);
        binding.rv.setLayoutManager(linearLayoutManager);


    }
}