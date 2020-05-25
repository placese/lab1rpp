package com.example.laba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class Splash_Screen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        runThread();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
    private void runThread() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Screen.this, Home_Screen.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}
