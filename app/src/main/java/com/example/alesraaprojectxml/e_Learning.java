package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.alesraaprojectxml.databinding.ActivityElearningSBinding;

import java.util.ArrayList;

public class e_Learning extends AppCompatActivity implements Rc_courses.Handle {
   TextView tv_nameCourse;
    TextView tv_idCourse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityElearningSBinding binding;
        binding=ActivityElearningSBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        tv_idCourse=findViewById(R.id.tv_id_courses);
        tv_nameCourse=findViewById(R.id.tv_nameCourse);




    }


    @Override
    public void clickHandle(int position, String nameCourse, String idCourse) {
        tv_nameCourse.setText(nameCourse);
        tv_idCourse.setText(idCourse);


    }
}