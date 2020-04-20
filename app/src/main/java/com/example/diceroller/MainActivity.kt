package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            showDie()
        }
    }

    private fun showDie() {
        val resultTextView: TextView = findViewById(R.id.result_tv)
        val random_number = Random().nextInt(6) + 1
//        resultTextView.setText(random_number.toString())
        resultTextView.text = random_number.toString()
    }
}
