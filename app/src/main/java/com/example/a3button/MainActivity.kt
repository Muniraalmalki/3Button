package com.example.a3button

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var etText1:EditText
    private lateinit var etText2:EditText
    private lateinit var etText3:EditText
    private lateinit var toastButton:Button
    private lateinit var updateButton:Button
    private lateinit var intentButton:Button
    private lateinit var tvText:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etText1 = findViewById(R.id.etText1)
        etText2 = findViewById(R.id.etText2)
        etText3 = findViewById(R.id.etText3)
        tvText = findViewById(R.id.tvText)
        toastButton = findViewById(R.id.button1)
        toastButton.setOnClickListener {
            Toast.makeText(this,"${etText1.text}",Toast.LENGTH_LONG).show()
            tvText.text = "${etText1.text}"
        }
        updateButton = findViewById(R.id.button2)
        updateButton.setOnClickListener {
            tvText.text = " ${etText1.text} ${etText2.text}${etText3.text}"
        }
        intentButton = findViewById(R.id.button3)
        intentButton.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("text1",etText1.text.toString())
            intent.putExtra("text2:",etText2.text.toString())
            intent.putExtra("text3:",etText3.toString())
            startActivity(intent)
        }

    }
}