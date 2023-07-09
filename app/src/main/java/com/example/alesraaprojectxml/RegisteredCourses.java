package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.alesraaprojectxml.databinding.ActivityRegisteredCoursesBinding;

import java.util.ArrayList;
import java.util.List;

public class RegisteredCourses extends AppCompatActivity implements Rc_courses.Handle {
    private ActivityRegisteredCoursesBinding binding;
    private Context context = RegisteredCourses.this;
    private Rc_courses rc_courses;
    private List<CoursesModel> coursesModels;
    Rc_courses.Handle handle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisteredCoursesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        coursesModels = new ArrayList<>();
        rc_courses = new Rc_courses(context, coursesModels,handle);
        rc_courses = new Rc_courses(context, coursesModels,handle);
        coursesModels.add(new CoursesModel(R.drawable.img_3, "تصميم تجربة المستخدم", "BMOB4313-s231"));
        coursesModels.add(new CoursesModel(R.drawable.img_3, "هندسة البرمجيات", "BMOB4313-s231"));
        coursesModels.add(new CoursesModel(R.drawable.img_3, "التجارة النقالة", "BMOB4313-s231"));
        coursesModels.add(new CoursesModel(R.drawable.img_3, "تصميم تجربة المستخدم", "BMOB4313-s231"));
        coursesModels.add(new CoursesModel(R.drawable.img_3, "تصميم تجربة المستخدم", "BMOB4313-s231"));
        coursesModels.add(new CoursesModel(R.drawable.img_3, "هندسة البرمجيات", "BMOB4313-s231"));
        coursesModels.add(new CoursesModel(R.drawable.img_3, "التجارة النقالة", "BMOB4313-s231"));
        coursesModels.add(new CoursesModel(R.drawable.img_3, "تصميم تجربة المستخدم", "BMOB4313-s231"));
        coursesModels.add(new CoursesModel(R.drawable.img_3, "تصميم تجربة المستخدم", "BMOB4313-s231"));
        coursesModels.add(new CoursesModel(R.drawable.img_3, "هندسة البرمجيات", "BMOB4313-s231"));
        coursesModels.add(new CoursesModel(R.drawable.img_3, "التجارة النقالة", "BMOB4313-s231"));
        coursesModels.add(new CoursesModel(R.drawable.img_3, "تصميم تجربة المستخدم", "BMOB4313-s231"));
        binding.rcRegisteredCourses.setAdapter(rc_courses);
        binding.rcRegisteredCourses.setLayoutManager(new GridLayoutManager(context, 2));
        binding.iconArrow.setOnClickListener(v -> {
            finish();
        });
        binding.icNot.setOnClickListener(v -> {
            startActivity(new Intent(context, Notices.class));
        });
    }


    @Override
    public void clickHandle(int position, String nameCourse, String idCourse) {
        startActivity(new Intent(getBaseContext(),e_Learning.class));

    }
}