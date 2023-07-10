package com.example.alesraaprojectxml;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alesraaprojectxml.databinding.RvExporthomworkscreendesignBinding;
import com.example.alesraaprojectxml.databinding.RvRecyclerviewDesignNoticesScreenBinding;

import java.util.ArrayList;

public class AdapterHomeWorkExport extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<ItemRvHomeWorkExport> arrayList;
    RvExporthomworkscreendesignBinding binding;
    ViewHandle_inter viewHandle_inter;


    public AdapterHomeWorkExport(Context context, ArrayList<ItemRvHomeWorkExport> arrayList,ViewHandle_inter viewHandle_inter) {
        this.context = context;
        this.arrayList = arrayList;
        this.viewHandle_inter=viewHandle_inter;
        //
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding=RvExporthomworkscreendesignBinding.inflate(LayoutInflater.from(context),parent,false);
        return new MyAdapter(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyAdapter myAdapter= (MyAdapter) holder;
        myAdapter.binding.tvNameCourse.setText(arrayList.get(position).getNameCourse());
        myAdapter.binding.tvNameStudent.setText(arrayList.get(position).getName());
        binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewHandle_inter.ClickHandle(position);

            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    public class MyAdapter extends RecyclerView.ViewHolder{
        RvExporthomworkscreendesignBinding binding;
        public MyAdapter(RvExporthomworkscreendesignBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
    public interface ViewHandle_inter {
        void ClickHandle(int pos);
    }

}
