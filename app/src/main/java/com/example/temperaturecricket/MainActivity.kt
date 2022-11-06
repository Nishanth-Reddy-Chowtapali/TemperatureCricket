package com.example.temperaturecricket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast




class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etChirps : TextView = findViewById(R.id.etChirps)
        val btnCalculate : Button = findViewById(R.id.btnCalculate)
        val tvResults : TextView = findViewById(R.id.tvResults)
        tvResults.visibility = View.GONE

    btnCalculate.setOnClickListener {
        if(etChirps.getText().toString().isEmpty())
        {
            Toast.makeText(applicationContext, "please enter a valid number", Toast.LENGTH_SHORT).show()
        }
        else{
            var chirps: Int = (etChirps.text.toString().trim()).toInt()
            var temp = chirps/3.0 + 4
            val FORMAT_FLOAT = "%.2f"
            var results : String = "The approximate temperature outside is ${String.format(FORMAT_FLOAT, temp)} degrees celsius"
            tvResults.setText(results)
            tvResults.visibility = View.VISIBLE
        }
    }

    }

}