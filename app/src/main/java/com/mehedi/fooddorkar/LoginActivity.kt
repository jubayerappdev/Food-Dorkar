package com.mehedi.fooddorkar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mehedi.fooddorkar.databinding.ActivityLoginBinding
import com.mehedi.fooddorkar.databinding.ActivityStartBinding

class LoginActivity : AppCompatActivity() {
    private val binding:ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            val intent = Intent(this,SignActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.doNotHaveButton.setOnClickListener {
            val intent = Intent(this,SignActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}