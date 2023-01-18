package com.eiro.intendexampleproject

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eiro.intendexampleproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val name = binding.editTextTextPersonName.text.toString()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(IntentKeys.NAME, name)
            startActivity(intent)
        }
    }
}