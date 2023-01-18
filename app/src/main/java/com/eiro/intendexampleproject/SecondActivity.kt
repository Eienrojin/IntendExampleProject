package com.eiro.intendexampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eiro.intendexampleproject.databinding.ActivityMainBinding
import com.eiro.intendexampleproject.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.extras?.getString(IntentKeys.NAME)

        binding.textView.text = "Hello $name"
    }
}