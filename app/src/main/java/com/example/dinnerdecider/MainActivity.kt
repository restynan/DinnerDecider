package com.example.dinnerdecider

import android.view.View



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var num= ArrayList<String>(arrayListOf
            ("Hamburger", "Pizza", "Mexican","American", "Chinese"))


        AddFood.setOnClickListener{
           var foodItem=food.text.toString()
            num.add(foodItem)
            food.text=null
            Toast.makeText(this, "$foodItem  added successfully", Toast.LENGTH_LONG).show()

        }
        Decide.setOnClickListener{
            // Change the Text view
            var randomIndex = Random().nextInt(num.size)
            var randomName =num.get(randomIndex)
            msg.text= randomName;

        }
    }



}