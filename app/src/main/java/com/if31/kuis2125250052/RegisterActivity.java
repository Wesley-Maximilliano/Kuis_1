package com.if31.kuis2125250052;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class RegisterActivity extends AppCompatActivity {
private EditText etFullName, etEmail, etPassword, etCfPassword;
private Spinner spNegara;
private Button btnDftr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etFullName = findViewById(R.id.et_fullname);
        etEmail = findViewById(R.id.et_email);
        etPassword = findViewById(R.id.et_password);
        etCfPassword = findViewById(R.id.et_cfpassword);
        spNegara = findViewById(R.id.sp_negara);

        btnDftr = findViewById(R.id.btn_dftr);
    }
}