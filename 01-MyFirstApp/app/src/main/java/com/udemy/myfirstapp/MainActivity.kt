package com.udemy.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Main
        fun main (args:Array<String>) {
            print("Welcome to kotlin")
            var a = 10
            var name:String = "hola"
            //Variables for read only
            val number = 10
            //number = 5 //ERROR
            //Variables que pueden ser nulas
            var dep:String?
            var name_ = readLine()
            var age:Int = readLine()!!.toInt()
            var pi:Double = readLine()!!.toDouble()
            //La nulidad marca una excepción si es nula, la obliga a tener un valor

            //caST
            var n1:Int = 10
            var n2:Int?
            var n2str:String = "12"
            n2 = n2str.toInt();
            var n2float:Float?
            n2float = n2str.toFloat();

            var xpi:Double = 3.14
            var spi = xpi.toString()
            print("spi:$spi")

            var z = 10
            var vars = when(z) {
                1 -> print("1")
                2 -> print("2")
                3 -> print("3")
                1,2 -> print("1 or 2")
                in 1..4 -> print("1 - 4")
                !in 1..4 -> print("5 - 10")
                else -> {
                    print("$z")
                }
            }

            var max = if(5>1) 5 else 1


        }

    }
}
