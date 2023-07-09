package com.example.alesraaprojectxml;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.alesraaprojectxml.databinding.ActivityNoticesBinding;

import java.util.ArrayList;

public class Notices extends AppCompatActivity implements AdapterNotices.ViewHandle {
    ArrayList<ItemRecyclerNoticesScreen>arrayList;
    Context context=Notices.this;
    ArrayList<ItemRecyclerNoticesScreen>arrayList_2;
    AdapterNotices.ViewHandle viewHandle;





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

        AdapterNotices adapterNotices=new AdapterNotices(context,arrayList,viewHandle);
        binding.recycler.setAdapter(adapterNotices);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(context);
        binding.recycler.setLayoutManager(linearLayoutManager);
        binding.recycler2.setAdapter(adapterNotices);
        LinearLayoutManager linearLayoutManager_2=new LinearLayoutManager(context);
        binding.recycler2.setLayoutManager(linearLayoutManager_2);
        binding.iconArrow.setOnClickListener(v -> {
           finish();
        });
        binding.iconHomework.setOnClickListener(v -> {
            startActivity(new Intent(context, HomeWorkScreen.class));
        });
        binding.iconModel.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://ar.israa.edu.ps"));
            startActivity(intent);
        });
        binding.iconHomePage.setOnClickListener(v -> {
            Toast.makeText(context, "الصفحة غير متوفرة الان", Toast.LENGTH_SHORT).show();
        });
        binding.iconOnlineLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(context,HomePageScreen.class));
            }
        });



    }


    @Override
    public void ClickHandle(boolean isCheck, int pos) {
        if (isCheck){
            arrayList_2.remove(pos);
            arrayList.remove(pos);

        }

    }

}
