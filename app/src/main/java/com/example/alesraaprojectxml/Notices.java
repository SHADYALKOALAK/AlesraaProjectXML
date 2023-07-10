package com.example.alesraaprojectxml;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.alesraaprojectxml.databinding.ActivityNoticesBinding;

import java.util.ArrayList;

public class Notices extends AppCompatActivity implements AdapterNotices.ViewHandle {
    private ArrayList<ItemRecyclerNoticesScreen> arrayList;
    private Context context = Notices.this;
    private ArrayList<ItemRecyclerNoticesScreen> arrayList_2;
    private AdapterNotices.ViewHandle viewHandle;
    private DBase dBase;


    @SuppressLint("NotifyDataSetChanged")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityNoticesBinding binding;
        binding = ActivityNoticesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        dBase = new DBase(context);
        arrayList = new ArrayList<>();
        arrayList_2 = new ArrayList<>();
//        arrayList.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم", "تم إضافة واجب جديد"
//                , R.drawable.logo_2, "قبل 3 ساعات"));
//        arrayList.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم", "تم إضافة واجب جديد"
//                , R.drawable.logo_2, "قبل 3 ساعات"));
//        arrayList.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم", "تم إضافة واجب جديد"
//                , R.drawable.logo_2, "قبل 3 ساعات"));
//        arrayList.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم", "تم إضافة واجب جديد"
//                , R.drawable.logo_2, "قبل 3 ساعات"));
//        arrayList.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم", "تم إضافة واجب جديد"
//                , R.drawable.logo_2, "قبل 3 ساعات"));
//        arrayList.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم", "تم إضافة واجب جديد"
//                , R.drawable.logo_2, "قبل 3 ساعات"));
//        arrayList.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم", "تم إضافة واجب جديد"
//                , R.drawable.logo_2, "قبل 3 ساعات"));
//        arrayList.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم", "تم إضافة واجب جديد"
//                , R.drawable.logo_2, "قبل 3 ساعات"));
//        arrayList.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم", "تم إضافة واجب جديد"
//                , R.drawable.logo_2, "قبل 3 ساعات"));
//        arrayList.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم", "تم إضافة واجب جديد"
//                , R.drawable.logo_2, "قبل 3 ساعات"));
//        arrayList_2.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم", "تم إضافة واجب جديد"
//                , R.drawable.logo_2, "قبل 3 ساعات"));
//        arrayList_2.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم", "تم إضافة واجب جديد"
//                , R.drawable.logo_2, "قبل 3 ساعات"));
//        arrayList_2.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم", "تم إضافة واجب جديد"
//                , R.drawable.logo_2, "قبل 3 ساعات"));
//        arrayList_2.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم", "تم إضافة واجب جديد"
//                , R.drawable.logo_2, "قبل 3 ساعات"));
//        arrayList_2.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم", "تم إضافة واجب جديد"
//                , R.drawable.logo_2, "قبل 3 ساعات"));
//        arrayList_2.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم", "تم إضافة واجب جديد"
//                , R.drawable.logo_2, "قبل 3 ساعات"));
//        arrayList_2.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم", "تم إضافة واجب جديد"
//                , R.drawable.logo_2, "قبل 3 ساعات"));
//        arrayList_2.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم", "تم إضافة واجب جديد"
//                , R.drawable.logo_2, "قبل 3 ساعات"));
//        arrayList_2.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم", "تم إضافة واجب جديد"
//                , R.drawable.logo_2, "قبل 3 ساعات"));
//        arrayList_2.add(new ItemRecyclerNoticesScreen("مساق تصميم تجربة المستخدم", "تم إضافة واجب جديد"
//                , R.drawable.logo_2, "قبل 3 ساعات"));
        Cursor notifications = dBase.getNotifications();
        while (notifications.moveToNext()) {
            @SuppressLint("Range") String noty = notifications.getString(notifications.getColumnIndex(notifications.getColumnName(1)));
            arrayList.add(new ItemRecyclerNoticesScreen("", noty
                    , R.drawable.logo_2, "قبل 1 دقيقة"));
        }

        AdapterNotices adapterNotices = new AdapterNotices(context, arrayList);
        binding.recycler.setAdapter(adapterNotices);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        binding.recycler.setLayoutManager(linearLayoutManager);
        binding.recycler2.setAdapter(adapterNotices);
        LinearLayoutManager linearLayoutManager_2 = new LinearLayoutManager(context);
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
                startActivity(new Intent(context, HomePageScreen.class));
            }
        });
        binding.tvClearAll.setOnClickListener(v -> {
            try {
                arrayList.clear();
                adapterNotices.notifyDataSetChanged();
                binding.text.setVisibility(View.GONE);
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }

        });
        binding.text.setVisibility(View.VISIBLE);
    }


    @Override
    public void ClickHandle(boolean isChick, int pos) {
        Toast.makeText(context, pos + "", Toast.LENGTH_SHORT).show();
        arrayList.remove(pos);
    }

}
