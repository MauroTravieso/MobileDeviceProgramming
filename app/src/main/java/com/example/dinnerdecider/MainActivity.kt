package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Task A
    var list = ArrayList<String>(arrayListOf("Hamburger","Pizza","Mexican","American","Chinese"))

    // Task B
    var food : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Task B
        // Add food type to the ArrayList
        button.setOnClickListener {
            // Check is the input is not empty
            if (!editText.text.toString().isEmpty()) {
                food = editText.text.toString()
                list.add(food)
                // Cleans the editText
                editText.getText().clear()
            }
        }
    }

    // Task A
    fun decide(view : View) {
        tv.text = list.random()
    }

}