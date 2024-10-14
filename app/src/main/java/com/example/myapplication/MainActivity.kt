package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val inputNumber = findViewById<EditText>(R.id.inputNumber)
        val showLettersButton = findViewById<Button>(R.id.button)
        val outputText = findViewById<TextView>(R.id.outputText)
        val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        showLettersButton.setOnClickListener {
            val input = inputNumber.text.toString()

            if (input.isNotEmpty()) {
                val numLetters = input.toIntOrNull()

                if (numLetters != null && numLetters in 1..26) {
                    val result = alphabet.take(numLetters)
                    outputText.text = result
                } else {
                    outputText.text = "Введіть число між 1 та 26."
                }
            }
        }
    }
}