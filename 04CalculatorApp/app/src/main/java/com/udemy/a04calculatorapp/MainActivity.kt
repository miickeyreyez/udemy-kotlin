package com.udemy.a04calculatorapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var operation = "*"
    var oldNumbers = ""
    var isNewOperation = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText.setText("")
    }

    fun numberClicked(view: View) {
        val selected = view as Button
        var number: String = editText.text.toString()
        if(isNewOperation) {
            editText.setText("")
        }
        isNewOperation = false

        when(selected.id) {
            button0.id -> {
                number += "0"
            }
            button1.id -> {
                number += "1"
            }
            button2.id -> {
                number += "2"
            }
            button3.id -> {
                number += "3"
            }
            button4.id -> {
                number += "4"
            }
            button5.id -> {
                number += "5"
            }
            button6.id -> {
                number += "6"
            }
            button7.id -> {
                number += "7"
            }
            button8.id -> {
                number += "8"
            }
            button9.id -> {
                number += "9"
            }
            buttonDot.id -> {
                number += "."
            }
            buttonPlusMinus.id -> {
                number = "-" + number
            }
        }
        editText.setText(number)
    }

    fun operation(view: View) {
        val selected = view as Button
        isNewOperation = true
        when(selected.id) {
            buttonDivide.id -> { operation = "/" }
            buttonMultiply.id -> { operation = "*" }
            buttonPlus.id -> { operation = "+" }
            buttonMinus.id -> { operation = "-" }
        }
        oldNumbers = editText.text.toString()
        editText.setText("")
        isNewOperation = true
    }

    fun equalsOperation(view: View) {
     var newNumber = editText.text.toString()
        var finalNumber: Double? = null
        when(operation) {
            "*" -> {
                finalNumber = oldNumbers.toDouble() * newNumber.toDouble()
            }
            "/" -> {
                finalNumber = oldNumbers.toDouble() / newNumber.toDouble()
            }
            "+" -> {
                finalNumber = oldNumbers.toDouble() + newNumber.toDouble()
            }
            "-" -> {
                finalNumber = oldNumbers.toDouble() - newNumber.toDouble()
            }
        }
        editText.setText(finalNumber.toString())
        isNewOperation = true
    }

    fun percent(view: View) {
        val number = editText.text.toString().toDouble()/100
        editText.setText(number.toString())
        isNewOperation = true
    }

    fun clean(view: View) {
        editText.setText(("0"))
        isNewOperation = true
    }
}
