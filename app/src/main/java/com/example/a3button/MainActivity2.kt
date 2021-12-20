package com.example.a3button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var tvText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        tvText = findViewById(R.id.tvText)

        val t1 = intent.getStringExtra("text1")
        val t2 = intent.getStringExtra("text2")
        val t3 = intent.getStringExtra("text3")
        tvText.text = "$t1 $t2 $t3"
    }
}