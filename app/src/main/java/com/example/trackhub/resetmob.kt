package com.example.trackhub

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class resetmob : AppCompatActivity() {
    private lateinit var b1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resetmob)
        b1=findViewById(R.id.confirm1)
        b1.setOnClickListener{
            val intent= Intent(this,resetotp::class.java)
            startActivity(intent)
        }
    }
}