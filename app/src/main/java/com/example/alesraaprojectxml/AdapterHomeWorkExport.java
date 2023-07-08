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

    public AdapterHomeWorkExport(Context context, ArrayList<ItemRvHomeWorkExport> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
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
}
