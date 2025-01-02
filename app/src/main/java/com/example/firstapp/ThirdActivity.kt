package com.example.firstapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ThirdActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        val buttonTop: Button = findViewById(R.id.buttonTop)
        val buttonCenterView: Button = findViewById(R.id.buttonCenterView)
        val buttonBottom: Button = findViewById(R.id.buttonBottom)

        val viewL1: View = findViewById(R.id.viewL1)
        val viewL2: View = findViewById(R.id.viewL2)
        val viewR1: View = findViewById(R.id.viewR1)
        val viewR2: View = findViewById(R.id.viewR2)

        buttonTop.setOnClickListener {
            viewL2.visibility = View.GONE
            viewR2.visibility = View.GONE
        }

        buttonBottom.setOnClickListener {
            viewL1.visibility = View.GONE
            viewR1.visibility = View.GONE
        }

        buttonCenterView.setOnClickListener {
            viewL1.visibility = View.VISIBLE
            viewL2.visibility = View.VISIBLE
            viewR1.visibility = View.VISIBLE
            viewR2.visibility = View.VISIBLE
        }

        }
    }
