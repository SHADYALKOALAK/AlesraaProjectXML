package com.example.alesraaprojectxml;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alesraaprojectxml.databinding.RcCustomCoursesBinding;


import java.util.List;

public class Rc_courses extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private List<CoursesModel> coursesModels;
    private RcCustomCoursesBinding binding;

    public Rc_courses(Context context, List<CoursesModel> coursesModels) {
        this.context = context;
        this.coursesModels = coursesModels;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = RcCustomCoursesBinding.inflate(LayoutInflater.from(context), parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.binding.iconCourses.setImageResource(coursesModels.get(position).getImage());
        myViewHolder.binding.tvNameCourses.setText(coursesModels.get(position).getNameCourses());
        myViewHolder.binding.tvIdCourses.setText(coursesModels.get(position).getIdCourses());


    }

    @Override
    public int getItemCount() {
        return coursesModels.size();
    }

    private class MyViewHolder extends RecyclerView.ViewHolder {
        private RcCustomCoursesBinding binding;

        public MyViewHolder(RcCustomCoursesBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
