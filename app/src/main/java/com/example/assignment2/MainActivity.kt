package com.example.assignment2

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var menu = ArrayList<String>(arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese"))

    fun decideFood(view: View) {
        var index: Int = (Math.random() * menu?.size).toInt()
        textView_displayFood.text = menu[index]
    }
    fun addFood(view: View) {
        val foodName = editText_FoodName.text.toString()
        menu.add(foodName)
    }
}