package com.example.sem4_07032024


import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.widget.CheckBox
import android.widget.EditText
import androidx.activity.ComponentActivity
import android.view.View

class SecondActivity : ComponentActivity() {
    fun onSubmitButtonClick(view: View) {
        val name = findViewById<EditText>(R.id.nameEditText).text.toString()
        val dob = findViewById<EditText>(R.id.dobEditText).text.toString()
        val checkBox = findViewById<CheckBox>(R.id.checkBox)

        if(name.isNotEmpty() && dob.isNotEmpty() && checkBox.isChecked){
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("name",name)
            intent.putExtra("dob",dob)
            startActivity(intent)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        Log.d("SecondActivity","SecondActivity: onCreate")
    }
    override fun onStart() {
        super.onStart()
        Log.d("SecondActivity", "SecondActivity: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SecondActivity", "SecondActivity: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SecondActivity", "SecondActivity: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SecondActivity", "SecondActivity: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SecondActivity", "SecondActivity: onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("SecondActivity", "SecondActivity: onRestart")
    }
}