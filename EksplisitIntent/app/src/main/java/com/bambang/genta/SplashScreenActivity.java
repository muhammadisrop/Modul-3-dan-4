package com.bambang.genta;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.bambang.genta.basketcounter_eksplisit_intent.MainActivity;
import com.bambang.genta.auth.SimpleLoginActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
                startActivity(new Intent(SplashScreenActivity.this, SimpleLoginActivity.class));
                finish();
            }
        }, 2000);
    }
}