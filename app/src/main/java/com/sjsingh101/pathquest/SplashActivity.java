package com.sjsingh101.pathquest;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        iv = findViewById(R.id.img);


    /*    ObjectAnimator animation = ObjectAnimator.ofFloat(iv, "translationY", -1400f);
        animation.setDuration(2000);
        animation.start();
*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            }
        }, 2000);
    }
}
