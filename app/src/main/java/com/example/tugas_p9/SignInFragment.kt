package com.example.tugas_p9

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.tugas_p9.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {
    private val TAG = "SignInFragmentLifecycle"
    private lateinit var binding: FragmentSignInBinding

    companion object {
        const val EXTRA_USERNAME = "extra_username"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignInBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loginButton.setOnClickListener {
            val enteredUsername = binding.usernameEditText.text.toString()
            val enteredPassword = binding.passwordEditText.text.toString()

            // Data statis
            val validUsernames = listOf("syifa", "hana", "bila")
            val validPasswords = listOf("1111", "2222", "3333")

            // Verifikasi username dan password
            val userIndex = validUsernames.indexOf(enteredUsername)
            if (userIndex != -1 && validPasswords[userIndex] == enteredPassword) {
                val intentToInResultActivity = Intent(requireContext(), InResultActivity::class.java)
                intentToInResultActivity.putExtra(EXTRA_USERNAME, enteredUsername)
                startActivity(intentToInResultActivity)
            }
            else {
                // Pesan kesalahan jika login gagal
                val errorMessage = "Login failed. Invalid username or password."
                Toast.makeText(requireContext(), errorMessage, Toast.LENGTH_SHORT).show()
            }
        }

        Log.d(TAG, "onViewCreated: dipanggil")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: dipanggil")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: dipanggil")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: dipanggil")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: dipanggil")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: dipanggil")
    }
}
