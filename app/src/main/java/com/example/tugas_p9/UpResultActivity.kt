package com.example.tugas_p9

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas_p9.databinding.ActivityUpResultBinding

class UpResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUpResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUpResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firstName = intent.getStringExtra(SignUpFragment.EXTRA_FIRST_NAME)
        val lastName = intent.getStringExtra(SignUpFragment.EXTRA_LAST_NAME)

        val welcomeMessage = "Welcome, $firstName $lastName!"
        binding.txtWelcomeMessage.text = welcomeMessage

    }
}
