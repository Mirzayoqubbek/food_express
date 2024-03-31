package com.example.foodexpress.screen.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.foodexpress.databinding.ActivitySplashBinding
import com.example.foodexpress.screen.auth.LoginActivity

class SplashActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgSplash.postDelayed({
                                      startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }, 2000)
    }
}