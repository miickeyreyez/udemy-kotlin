package com.udemy.a02_findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.text = "Find age"
        button.setOnClickListener {
            button.text = "Clicked"
            var year = editText.text.toString().toInt()
            var age = Calendar.getInstance().get(Calendar.YEAR) - year
            textView.text = "Age: " + age.toString()
        }
    }

    fun sayHello() {
        textView.text = "Hello"
    }
}
