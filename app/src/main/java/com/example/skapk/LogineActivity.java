package com.example.skapk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LogineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logine);

        getSupportActionBar().hide();
    }
}