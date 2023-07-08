package com.example.alesraaprojectxml;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.alesraaprojectxml.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Context context = MainActivity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnLogin.setOnClickListener(v -> {
            String number = binding.editNumberOfUneversity.getText().toString().trim();
            String password = binding.editPassword.getText().toString().trim();
            if (number.isEmpty()) {
                binding.editNumberOfUneversity.setError("من فضلك أدخل رقم الجامعي ");
            } else if (password.isEmpty()) {
                binding.editPassword.setError("من فضلك أدخل كلمة المرور ");
            } else {
                if (chickLogin(number,password)){
                    startActivity(new Intent(context,HomePageScreen.class));
                    finish();
                }
            }
        });

    }

    private boolean chickLogin(String number, String password) {
        if (number.equals("123") && password.equals("Admin")) {
            return true;
        } else if (number.equals("20191454") && password.equals("123456789")) {
            return true;
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle("تحذير").setMessage("حدث خطأ أثناء المطابقة");
            builder.show();
            return false;
        }
    }
}