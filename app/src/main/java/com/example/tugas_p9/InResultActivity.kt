package com.example.tugas_p9

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas_p9.databinding.ActivityInResultBinding

class InResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mendapatkan data username yang dikirimkan dari SignInFragment
        val username = intent.getStringExtra(SignInFragment.EXTRA_USERNAME)
        binding.txtWelcomeMessage.text = "Welcome, $username!"

    }
}
