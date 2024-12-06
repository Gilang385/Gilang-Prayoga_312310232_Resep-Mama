package com.example.resepmama;

// SplashActivity.java
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    // Durasi tampilan splash screen dalam milidetik (contoh: 3000 ms = 3 detik)
    private static final int SPLASH_DURATION = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Handler untuk menunda perpindahan ke MainActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Mulai MainActivity setelah durasi selesai
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Tutup SplashActivity
            }
        }, SPLASH_DURATION);
    }
}
