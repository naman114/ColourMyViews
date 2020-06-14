package com.example.colourmyviews

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
        val myViewList : List<View> = listOf(box_one, box_two_text, box_three_text, box_four_text, box_five_text, constraint_layout,
        red_button, yellow_button, blue_button)

        for(item in myViewList){
//            item.setOnClickListener(setColour(it)); to use it you must place the call in {}
            item.setOnClickListener{setColour(it)}
        }
    }
    private fun setColour(v : View){
        when(v.id){
            //Color class
            R.id.box_one -> v.setBackgroundColor(Color.BLACK)
            R.id.box_two_text -> v.setBackgroundColor(Color.CYAN)

            //Android color resources
            R.id.box_three_text -> v.setBackgroundResource(android.R.color.holo_purple)
            R.id.box_four_text -> v.setBackgroundResource(android.R.color.holo_red_light)
            R.id.box_five_text -> v.setBackgroundResource(android.R.color.holo_green_light)

            //custom colours
            R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
            R.id.blue_button -> box_five_text.setBackgroundColor(Color.BLUE)


            else -> v.setBackgroundResource(android.R.color.darker_gray)
        }
    }

}
