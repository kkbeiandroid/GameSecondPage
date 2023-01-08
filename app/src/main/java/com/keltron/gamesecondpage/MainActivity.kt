package com.keltron.gamesecondpage

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    enum class Turn
    {
        NOUGHT,
        CROSS

    }
    private var firstTurn = Turn.CROSS
    private var currentTurn = Turn.CROSS
    private lateinit var binding :

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun boardTapped(view: View)
    {



    }
}