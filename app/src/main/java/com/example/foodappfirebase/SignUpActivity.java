package com.example.foodappfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    private Button registerButton;
    private TextView alreadyAccountTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().setTitle("Sign Up");

        registerButton = findViewById(R.id.signUpRegisterBtnId);
        alreadyAccountTv = findViewById(R.id.alreadyHaveAccountTextViewId);

        registerButton.setOnClickListener(this);
        alreadyAccountTv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.signUpRegisterBtnId) {
            Intent signUpIntent = new Intent(SignUpActivity.this, SignInActivity.class);
            startActivity(signUpIntent);
        } else if (v.getId() == R.id.alreadyHaveAccountTextViewId) {
            Intent alreadtAcIntent = new Intent(SignUpActivity.this, SignInActivity.class);
            startActivity(alreadtAcIntent);
        }
    }
}
