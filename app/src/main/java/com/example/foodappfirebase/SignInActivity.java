package com.example.foodappfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView createAccountTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        getSupportActionBar().setTitle("Sign In");

        createAccountTv = findViewById(R.id.createAccountTextViewId);
        createAccountTv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent createAcIntenet = new Intent(SignInActivity.this,SignUpActivity.class);
        startActivity(createAcIntenet);
    }
}