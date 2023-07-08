package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.example.alesraaprojectxml.databinding.ActivityHomePageScreenBinding;

import java.util.ArrayList;
import java.util.List;

public class HomePageScreen extends AppCompatActivity {
    private ActivityHomePageScreenBinding binding;
    private Context context = HomePageScreen.this;
    private List<CoursesModel> coursesModels;
    private Rc_courses rc_courses;
    private List<LectureModel> lectureModels;
    private RcLecture rcLecture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomePageScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        coursesModels = new ArrayList<>();
        System.out.println("");
        lectureModels = new ArrayList<>();
        rcLecture = new RcLecture(context, lectureModels);
        rc_courses = new Rc_courses(context, coursesModels);
        coursesModels.add(new CoursesModel(R.drawable.img_3, "تصميم تجربة المستخدم", "BMOB4313-s231"));
        coursesModels.add(new CoursesModel(R.drawable.img_3, "هندسة البرمجيات", "BMOB4313-s231"));
        coursesModels.add(new CoursesModel(R.drawable.img_3, "التجارة النقالة", "BMOB4313-s231"));
        coursesModels.add(new CoursesModel(R.drawable.img_3, "تصميم تجربة المستخدم", "BMOB4313-s231"));
        lectureModels.add(new LectureModel("تصميم تجربة المستخدم", "د. غسان أبو سمهدانة"));
        lectureModels.add(new LectureModel("هندسة البرمجيات", "م. ريهام مقاط"));
        lectureModels.add(new LectureModel("تصميم تجربة المستخدم", "د. غسان أبو سمهدانة"));
        lectureModels.add(new LectureModel("تصميم تجربة المستخدم", "د. غسان أبو سمهدانة"));
        System.out.println();
        binding.rcCourses.setAdapter(rc_courses);
        binding.rcCourses.setLayoutManager(new LinearLayoutManager(context, RecyclerView.HORIZONTAL, true));
        binding.rcLectureName.setAdapter(rcLecture);
        binding.rcLectureName.setLayoutManager(new LinearLayoutManager(context, RecyclerView.VERTICAL, false));

    }
}