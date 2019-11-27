package com.example.dinnerdecider

import android.view.View



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var num= ArrayList<String>(arrayListOf
            ("Hamburger", "Pizza", "Mexican","American", "Chinese"))

        button2.setOnClickListener{
            // Change the Text view
            var randomIndex = Random().nextInt(num.size)
            var randomName =num.get(randomIndex)
            msg.text= randomName;

        }
        button1.setOnClickListener{

            num.add(food.text.toString())

        }
    }



}