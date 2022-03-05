package com.example.myapplication

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)


        button.setOnClickListener{
            callActivity();
        }

    }



    private fun callActivity(){
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()

        val intent = Intent(this,MainActivity2::class.java).also {
            it.putExtra("EXTRA_MESSAGE", message)
            startActivity(it)
        }
    }
}