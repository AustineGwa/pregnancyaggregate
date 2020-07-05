package com.hackathon.sailors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {
    EditText etName,etEmail,etPassword,etConfirmPassword;
    TextView tvLogin;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        etName = findViewById(R.id.et_Name);
        etEmail = findViewById(R.id.et_Email);
        etPassword = findViewById(R.id.et_password);
        etConfirmPassword = findViewById(R.id.conPassword);
        tvLogin =  findViewById(R.id.tvLogin);
        btnSignUp = findViewById(R.id.btnLogin);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignUpIntent = new Intent(SignUpActivity.this, MainActivity.class);
            }
        });

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignUpIntent = new Intent(SignUpActivity.this, LogInActivity.class);
            }
        });

    }
}
