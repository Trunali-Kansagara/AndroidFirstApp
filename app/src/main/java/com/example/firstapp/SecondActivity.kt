package com.example.firstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class SecondActivity : ComponentActivity() {
    lateinit var nextButton: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // Reference the layout file (activity_second.xml)
        nextButton= findViewById(R.id.btn_authorize)
        // Optional: If you passed any data from MainActivity, you can retrieve it here

        nextButton.setOnClickListener{
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
        // Example: Use the data (e.g., show it in a TextView)
        // val textView = findViewById<TextView>(R.id.textView)
        // textView.text = passedData
    }
}