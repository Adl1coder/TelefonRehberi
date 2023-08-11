package com.example.telefonrehberi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.telefonrehberi.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val editTextAd = binding.editTextName
        val editTextPassword = binding.editTextPhone

        binding.buttonKaydet.setOnClickListener {
            if (editTextAd.text.isEmpty() || editTextPassword.text.isEmpty()) {
                Snackbar.make(it, "Boş alanları doldurunuz", Snackbar.LENGTH_LONG).show()
            } else {
                val loginIntent = Intent(this@MainActivity, OnayActivity::class.java)
                startActivity(loginIntent)
            }
        }
    }
}
