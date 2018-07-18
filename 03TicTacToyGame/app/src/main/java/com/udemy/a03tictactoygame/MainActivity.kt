package com.udemy.a03tictactoygame

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var p1 = ArrayList<Int>()
    var p2 = ArrayList<Int>()
    var active = 1

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
        playGame(id, selected)
    }

    fun playGame(id: Int, selected: Button) {
        if(active == 1) {
            selected.text = "X"
            selected.setBackgroundColor(Color.GREEN)
            p1.add(id)
            active = 2
            autoPlay()
        } else {
            selected.text = "0"
            selected.setBackgroundColor(Color.BLUE)
            p2.add(id)
            active = 1
        }
        selected.isEnabled = false
        checkWinner()
    }

    fun checkWinner() {
        var winner = -1
        if(p1.contains(1) && p1.contains(2) && p1.contains(3)) {
            winner = 1
        }
        if(p1.contains(1) && p1.contains(5) && p1.contains(9)) {
            winner = 1
        }
        if(p2.contains(4) && p2.contains(5) && p2.contains(6)) {
            winner = 2
        }
        if(p2.contains(3) && p2.contains(5) && p2.contains(7)) {
            winner = 2
        }

        if(winner != -1) {
            if(winner == 1) {
                Toast.makeText(this, "P1 Wins!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "P2 Wins!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun autoPlay() {
        var emptyCells = ArrayList<Int>();
        for(empty in 1..9) {
            if(!(p1.contains(empty)) || !(p2.contains(empty))) {
                emptyCells.add(empty);
            }
        }

        var r = Random();
        val randIndex = r.nextInt(emptyCells.size - 1) + 1
        val celId = emptyCells[randIndex]

        var selected: Button
        when(celId) {
            1 -> selected = button
            2 -> selected = button2
            3 -> selected = button3
            4 -> selected = button4
            5 -> selected = button5
            6 -> selected = button6
            7 -> selected = button7
            8 -> selected = button8
            9 -> selected = button8
            else -> {
                selected = button
            }
        }
        playGame(celId, selected)
    }
}
