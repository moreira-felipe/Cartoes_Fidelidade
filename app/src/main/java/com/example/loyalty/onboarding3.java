package com.example.loyalty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.loyalty.Controller.LoginActivity;

import androidx.appcompat.app.AppCompatActivity;

public class onboarding3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_onboarding3);

    }
    public void ButtonNext(View view) {
        Intent it = new Intent(getBaseContext(), LoginActivity.class);
        startActivity(it);
    }
}