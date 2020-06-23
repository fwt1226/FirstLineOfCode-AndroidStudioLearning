package com.example.uicustomviews;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.ActionBar;
//自动生成为import android.app.ActionBar; 报错

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionbar = getSupportActionBar();
        if(actionbar != null)
            actionbar.hide();
    }
}
