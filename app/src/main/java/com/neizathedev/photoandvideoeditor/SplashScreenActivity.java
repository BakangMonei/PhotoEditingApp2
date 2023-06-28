package com.neizathedev.photoandvideoeditor;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @Author: Monei Bakang Mothuti
 * @Date: Wednesday June 2023
 * @Time: 3:14 PM
 */

public class SplashScreenActivity extends AppCompatActivity {
    private ImageView splashScreenImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
