package com.example.alesraaprojectxml;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.CustomDescription;
import android.view.View;
import android.widget.Toast;

import com.example.alesraaprojectxml.databinding.ActivityUploodScreenBinding;
import com.example.alesraaprojectxml.databinding.CustomdailogBinding;

public class UploodScreen extends AppCompatActivity {
    private ActivityUploodScreenBinding binding;
    private Context context = UploodScreen.this;
    private DBase dBase;
    private ActivityResultLauncher<String> filePickerLauncher;
    private String filePath;
    private CustomdailogBinding customDialog;
    private AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityUploodScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        dBase = new DBase(context);


        binding.btnUpLoade.setOnClickListener(v -> {
            String location = binding.editTitle.getText().toString().trim();
            String dis = binding.editDescription.getText().toString().trim();
            String link = binding.editLink.getText().toString().trim();
            if (!location.isEmpty() && !dis.isEmpty() && !link.isEmpty()) {
                showAlertDialog(location,dis,link);

            } else if (!location.isEmpty() && !dis.isEmpty() && !filePath.isEmpty()) {
                showAlertDialog(location,dis,filePath);
            }

        });

        filePickerLauncher = registerForActivityResult(new ActivityResultContracts.GetContent(),
                uri -> {
                    if (uri != null) {
                        // Handle the selected file here
                        filePath = uri.getPath();
                        // Upload the file to your application or perform further operations
                        Toast.makeText(context, "Selected file: " + filePath, Toast.LENGTH_SHORT).show();
                        binding.btnChooseFile.setVisibility(View.VISIBLE);
                        binding.edUpLoadeFile.setText("تم رفع الملف");
                    }
                });
        binding.btnChooseFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch file picker when a button or any UI element is clicked
                openFilePicker();


            }
        });


    }

    private void openFilePicker() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        filePickerLauncher.launch("application/pdf");
    }

    private void showAlertDialog(String location,String dis,String path) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        customDialog = CustomdailogBinding.inflate(getLayoutInflater());
        builder.setView(customDialog.getRoot());
        customDialog.btnYes.setOnClickListener(v1 -> {
            if (dBase.insertAdminFile(new UpLoadeAdminModel(location, dis, path))) {
                Toast.makeText(context, "تم الرفع", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        customDialog.btnNo.setOnClickListener(v12 -> {
            dialog.dismiss();
        });
        dialog = builder.create();
        dialog.show();
    }

}
