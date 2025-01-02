package com.example.firstapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.NumberPicker
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge


class MainActivity : ComponentActivity() {
    lateinit var agePicker: NumberPicker;
    lateinit var nextButton: Button;
    lateinit  var userName :EditText;
    lateinit var userEmail :EditText;
    lateinit  var userPassword :EditText;
    lateinit  var contactNumber :EditText;

    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            setContentView(R.layout.activity_main)
            agePicker = findViewById(R.id.agePicker)
            nextButton= findViewById(R.id.nextButton)
            userName = findViewById(R.id.username)
            userEmail = findViewById(R.id.useremail)
            userPassword = findViewById(R.id.password)
            contactNumber = findViewById(R.id.contactNumber)

            // Set NumberPicker range
            agePicker.minValue = 18
            agePicker.maxValue = 100

            nextButton.setOnClickListener{

                if (validateInput()) {
                    // Proceed to the next screen or action
                    Toast.makeText(this, "All inputs are valid!", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, SecondActivity::class.java)
                    startActivity(intent)
                    // Navigate to SecondActivity after successful validation


                }
            }


        }
    }

fun validateInput():Boolean{
    var isValid = true;
    if(userName.text.isEmpty()){
        userName.error ="Please enter user name"
        isValid=false
    }

    if(userEmail.text.isEmpty()){
        userEmail.error= "Please enter user email";
        isValid=false
    }else if(!android.util.Patterns.EMAIL_ADDRESS.matcher(userEmail.text.toString()).matches()){
        userEmail.error= "Please enter valid email address";
        isValid=false
    }

    if(userPassword.text.isEmpty()){
        userPassword.error = "Please enter user password";
        isValid=false
    }

    if(contactNumber.text.isEmpty()){
        contactNumber.error = "Please enter user contact number"
        isValid=false
    }else if(!android.util.Patterns.PHONE.matcher(contactNumber.text.toString()).matches()){
        contactNumber.error = "Please enter valid contact number"
        isValid=false
    }

    return isValid
}
}



