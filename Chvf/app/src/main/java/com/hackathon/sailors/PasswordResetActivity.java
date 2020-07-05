package com.hackathon.sailors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PasswordResetActivity extends AppCompatActivity {
    //password reset credentials
    EditText etAccountEmail;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_reset);
        etAccountEmail =findViewById(R.id.etResetEmail);
        btnReset = findViewById(R.id.btnResetPassword);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //send email notification
            }
        });
    }
}
