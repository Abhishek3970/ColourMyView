package com.example.colourmyview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    private fun setListeners() {
        val clickables : List<View> = listOf(box1 , box2 , box3 , box4, box5, layoutId, redButton, yellowButton , greenButton )

        for(item in clickables ){
            item.setOnClickListener { makeColour(it) }
        }
    }



        fun makeColour(view: View) {
            when (view.id) {

                // Boxes using Color class colors for background
                R.id.box1 -> view.setBackgroundColor(Color.DKGRAY)
                R.id.box2 -> view.setBackgroundColor(Color.GRAY)

                // Boxes using Android color resources for background
                R.id.box3 -> view.setBackgroundResource(android.R.color.holo_green_light)
                R.id.box4 -> view.setBackgroundResource(android.R.color.holo_green_dark)
                R.id.box4 -> view.setBackgroundResource(android.R.color.holo_green_light)
                R.id.redButton -> box3.setBackgroundResource(R.color.my_red)
                R.id.yellowButton -> box4.setBackgroundResource(R.color.my_yellow)
                R.id.greenButton -> box5.setBackgroundResource(R.color.my_green)

                else -> view.setBackgroundColor(Color.LTGRAY)
            }
        }
    }

