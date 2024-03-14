package com.example.sem4_07032024

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity

class ThirdActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_activity)
        Log.d("ThirdActivity","ThirdActivity: onCreate")

        val name = intent.getStringExtra("name")
        val dob = intent.getStringExtra("dob")

        val nameTextView = findViewById<TextView>(R.id.nameTextView)
        val dobTextView = findViewById<TextView>(R.id.dobTextView)

        nameTextView.text = "Jméno: $name"
        dobTextView.text = "Datum narození: $dob"
    }

    override fun onStart() {
        super.onStart()
        Log.d("ThirdActivity", "ThirdActivity: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ThirdActivity", "ThirdActivity: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ThirdActivity", "ThirdActivity: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ThirdActivity", "ThirdActivity: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ThirdActivity", "ThirdActivity: onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ThirdActivity", "ThirdActivity: onRestart")
    }
}