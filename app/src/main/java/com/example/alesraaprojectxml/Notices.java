package com.example.alesraaprojectxml;

import android.content.Context;
import android.os.Bundle;



import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.alesraaprojectxml.databinding.ActivityNoticesBinding;

import java.util.ArrayList;

public class Notices extends AppCompatActivity {
    ArrayList<ItemRecyclerNoticesScreen>arrayList;
    Context context=Notices.this;
    ArrayList<ItemRecyclerNoticesScreen>arrayList_2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityNoticesBinding binding;
        binding=ActivityNoticesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        arrayList=new ArrayList<>();
        arrayList_2=new ArrayList<>();
        arrayList.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم","تم إضافة واجب جديد"
                ,R.drawable.logo_2,"قبل 3 ساعات"));
        arrayList.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم","تم إضافة واجب جديد"
                ,R.drawable.logo_2,"قبل 3 ساعات"));
        arrayList.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم","تم إضافة واجب جديد"
                ,R.drawable.logo_2,"قبل 3 ساعات"));
        arrayList.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم","تم إضافة واجب جديد"
                ,R.drawable.logo_2,"قبل 3 ساعات"));
        arrayList.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم","تم إضافة واجب جديد"
                ,R.drawable.logo_2,"قبل 3 ساعات"));
        arrayList.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم","تم إضافة واجب جديد"
                ,R.drawable.logo_2,"قبل 3 ساعات"));
        arrayList.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم","تم إضافة واجب جديد"
                ,R.drawable.logo_2,"قبل 3 ساعات"));
        arrayList.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم","تم إضافة واجب جديد"
                ,R.drawable.logo_2,"قبل 3 ساعات"));
        arrayList.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم","تم إضافة واجب جديد"
                ,R.drawable.logo_2,"قبل 3 ساعات"));
        arrayList.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم","تم إضافة واجب جديد"
                ,R.drawable.logo_2,"قبل 3 ساعات"));
        arrayList_2.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم","تم إضافة واجب جديد"
                ,R.drawable.logo_2,"قبل 3 ساعات"));
        arrayList_2.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم","تم إضافة واجب جديد"
                ,R.drawable.logo_2,"قبل 3 ساعات"));
        arrayList_2.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم","تم إضافة واجب جديد"
                ,R.drawable.logo_2,"قبل 3 ساعات"));
        arrayList_2.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم","تم إضافة واجب جديد"
                ,R.drawable.logo_2,"قبل 3 ساعات"));
        arrayList_2.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم","تم إضافة واجب جديد"
                ,R.drawable.logo_2,"قبل 3 ساعات"));
        arrayList_2.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم","تم إضافة واجب جديد"
                ,R.drawable.logo_2,"قبل 3 ساعات"));
        arrayList_2.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم","تم إضافة واجب جديد"
                ,R.drawable.logo_2,"قبل 3 ساعات"));
        arrayList_2.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم","تم إضافة واجب جديد"
                ,R.drawable.logo_2,"قبل 3 ساعات"));
        arrayList_2.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم","تم إضافة واجب جديد"
                ,R.drawable.logo_2,"قبل 3 ساعات"));
        arrayList_2.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم","تم إضافة واجب جديد"
                ,R.drawable.logo_2,"قبل 3 ساعات"));

        AdapterNotices adapterNotices=new AdapterNotices(context,arrayList);
        binding.recycler.setAdapter(adapterNotices);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(context);
        binding.recycler.setLayoutManager(linearLayoutManager);
        binding.recycler2.setAdapter(adapterNotices);
        LinearLayoutManager linearLayoutManager_2=new LinearLayoutManager(context);
        binding.recycler2.setLayoutManager(linearLayoutManager_2);














    }
}
