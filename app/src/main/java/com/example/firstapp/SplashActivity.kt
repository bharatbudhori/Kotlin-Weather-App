package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import java.util.logging.Logger

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler(Looper.getMainLooper()).postDelayed(
            {
                // This method will be executed once the timer is over
                // Start your app main activity
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                // close this activity
                finish()
            },
            2000
        ) // 3000 is the delayed time in milliseconds.
    }
}