package com.example.project4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var data = Users(
            listOf(
                User(
                    "Friend A",
                    "friendA@a.com",
                    "male",
                    true
                ),
                User(
                    "Friend B",
                    "friendB@a.com",
                    "male",
                    true
                ),
                User(
                    "Friend C",
                    "friendC@a.com",
                    "male",
                    true
                )
            )
        )

        binding.apply {
            btnMoveActivity.setOnClickListener {
                var intent = Intent(this@MainActivity, MainActivity2::class.java)
                intent.putExtra("INI DATA BARU", data)
                startActivity(intent)
                finish()
            }
        }
    }
}