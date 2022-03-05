package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val message = intent.getStringExtra("EXTRA_MESSAGE")

        val imageView = findViewById<ImageView>(R.id.imageView)

        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }

        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener{
        callActivity();
            }
        }

        private fun callActivity() {
        val i = Intent(this,MainActivity::class.java).also {
        startActivity(it)

        }


    }
}