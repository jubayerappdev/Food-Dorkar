package com.mehedi.fooddorkar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mehedi.fooddorkar.databinding.ActivitySignBinding

class SignActivity : AppCompatActivity() {

    private val binding : ActivitySignBinding by lazy {
        ActivitySignBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.createButton.setOnClickListener {
            val intent = Intent(this,LocationActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.alreadyHaveButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}