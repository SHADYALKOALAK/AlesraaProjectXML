package com.example.alesraaprojectxml;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.alesraaprojectxml.databinding.ActivityLoginScreenBinding;

public class LoginScreen extends AppCompatActivity {
    private ActivityLoginScreenBinding binding;
    private Context context = LoginScreen.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = binding.editNumberOfUneversity.getText().toString().trim();
                String password = binding.editPassword.getText().toString().trim();
                if (number.isEmpty()) {
                    binding.editNumberOfUneversity.setError("من فضلك أدخل رقم الجامعي");
                } else if (password.isEmpty()) {
                    binding.editPassword.setError("من فضلك أدخل كلمة المرور");
                } else {
                    chickLogin(number, password);
                    finish();
                }
            }
        });
    }

    private boolean chickLogin(String number, String password) {
        if (number.equals("123") && password.equals("Admin")) {
            startActivity(new Intent(context, Admin_1.class));
            return true;
        } else if (number.equals("20191454") && password.equals("123456789")) {
            startActivity(new Intent(context, HomePageScreen.class));
            return true;
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle("تحذير").setMessage("حدث خطأ أثناء المطابقة");
            builder.show();
            return true;
        }
    }
}