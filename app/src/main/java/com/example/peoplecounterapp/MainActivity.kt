package com.example.peoplecounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCLickMe = findViewById<Button>(R.id.click)
        val tvMyTetView = findViewById<TextView>(R.id.textView)
        val btnReset = findViewById<Button>(R.id.reset)
        var timesClicked = 0
        btnCLickMe.text = "Click"
        btnCLickMe.setOnClickListener{
            timesClicked += 1

            tvMyTetView.text = timesClicked.toString()
        }
        btnReset.setOnClickListener {
            timesClicked = 0
            tvMyTetView.text = "0"

            Toast.makeText(this, "Counter has been RESET!", Toast.LENGTH_LONG).show()
        }
    }
}