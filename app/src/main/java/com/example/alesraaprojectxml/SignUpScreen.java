package com.example.alesraaprojectxml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import com.example.alesraaprojectxml.databinding.ActivitySginUpScreenBinding;

public class SignUpScreen extends AppCompatActivity {
    private ActivitySginUpScreenBinding binding;
    private Context context = SignUpScreen.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySginUpScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btnSignUp.setOnClickListener(v -> {
            String userName = binding.editUserName.getText().toString().trim();
            String number = binding.editNumberOfUneversity.getText().toString().trim();
            String password = binding.editPassword.getText().toString().trim();
            String confirmPassword = binding.editConfirmPassword.getText().toString().trim();
            if (userName.isEmpty()) {
                binding.editUserName.setError("أدخل إسم المستخدم من فضلك");
            } else if (number.isEmpty()) {
                binding.editNumberOfUneversity.setError("أدخل الرقم الجامعي من فضلك");
            } else if (password.isEmpty()) {
                binding.editPassword.setError("أدخل كلمة المرور من فضلك");
            } else if (confirmPassword.isEmpty()) {
                binding.editConfirmPassword.setError("أدخل تاكيد كلمة المرور من فضلك");
            } else if (!confirmPassword.equals(password)) {
                binding.editConfirmPassword.setError("تاكد من تطابق كلمة المرور");
            } else {

            }
        });
    }
}