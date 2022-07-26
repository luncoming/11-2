package com.example.tue11_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
        val boxOneTV = findViewById<TextView>(R.id.boxOne)
        val boxTwoTV = findViewById<TextView>(R.id.box2)
        val boxThreeTV = findViewById<TextView>(R.id.box3)
        val boxFourTV = findViewById<TextView>(R.id.box4)
        val boxFiveTV = findViewById<TextView>(R.id.box5)

        val clickablesViews: List<View> =
            listOf(
                boxOneTV,boxTwoTV,boxThreeTV,boxFourTV,boxFiveTV
            )

        for(item in clickablesViews){
            item.setOnClickListener { makeColored(it)}
        }
    }

    private fun makeColored(view: View) {
        when (view.id){

            R.id.boxOne-> view.setBackgroundColor(Color.RED)
            R.id.box2-> view.setBackgroundColor(Color.BLUE)
            R.id.box3-> view.setBackgroundColor(Color.CYAN)
            R.id.box4-> view.setBackgroundColor(Color.GRAY)
            R.id.box5-> view.setBackgroundColor(Color.MAGENTA)
            else -> view.setBackgroundColor(Color.YELLOW)
        }

    }
}