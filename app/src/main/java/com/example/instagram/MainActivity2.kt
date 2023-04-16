package com.example.instagram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        initViews()
    }

    private fun initViews() {
        val sign_in = findViewById<TextView>(R.id.sign_in)
        sign_in.setOnClickListener{
            val intent= Intent(this@MainActivity2,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}