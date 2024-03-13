package com.example.sem4_07032024

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.ComponentActivity


class MainActivity : ComponentActivity() {

    fun onButtonClick(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        Log.d("MainActivity","MainActivity: onCreate")
    }
    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "MainActivity: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "MainActivity: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "MainActivity: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "MainActivity: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "MainActivity: onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "MainActivity: onRestart")
    }
}