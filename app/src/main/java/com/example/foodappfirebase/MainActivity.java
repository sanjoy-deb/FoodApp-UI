package com.example.foodappfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button loginButton, registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Transparent actionBer
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        getSupportActionBar().hide();

        loginButton = findViewById(R.id.loginBtnId);
        registerButton = findViewById(R.id.mainRegisterBtnId);

        loginButton.setOnClickListener(this);
        registerButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.loginBtnId) {
            Intent loginIntent = new Intent(MainActivity.this, SignInActivity.class);
            startActivity(loginIntent);
            Toast.makeText(this, "Login Button is clicked", Toast.LENGTH_SHORT).show();

        } else if (v.getId() == R.id.mainRegisterBtnId) {

            Intent registerIntent = new Intent(MainActivity.this, SignUpActivity.class);
            startActivity(registerIntent);
            Toast.makeText(this, "Register Button is clicked", Toast.LENGTH_SHORT).show();
        }
    }
}