package com.udemy.a03tictactoygame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    protected fun clicked(view: View) {
        val selected = view as Button
        var id = 0
        when(selected.id) {
            R.id.button -> id = 1
            R.id.button2 -> id = 2
            R.id.button3 -> id = 3
            R.id.button4 -> id = 4
            R.id.button5 -> id = 5
            R.id.button6 -> id = 6
            R.id.button7 -> id = 7
            R.id.button8 -> id = 8
            R.id.button9 -> id = 9
        }
    }
}
