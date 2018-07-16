package com.udemy.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.io.FileReader
import java.io.FileWriter

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

            var max = if(5 > 1) 5 else 1

            for(item in 1..5) {

            }

            var title = "Mi titulo"
            print(title[0]);
            print(title.split(" "));

            var arrayInt = Array<Int>(5){0};

            var map = hashMapOf<Int,String>(1 to "angel", 2 to "reyes")
            print(map.get(3))
            print(map[3])

            var arr = arrayOf(1,10,3,5)
            var list = listOf<Int>(1,2,3,4,5)

            //Set es inmutable
            var setElement = setOf<Int>(1,2,3,4,5)
            var setMutableElement = mutableSetOf<Int>(1,2,3,4,5)

            fun writeToFile(str:String) {
                var fo = FileWriter("test.txt",true)
                fo.write(str)
                fo.close();
            }

            fun readToFile() {
                var fo = FileReader("test.txt")
                var c:Int?
                do {
                    c = fo.read();
                    print(c.toChar())
                }
                fo.close()
            }
        }

        inner class Singleton {
            companion object {
                val instance:Singleton by lazy { Singleton() }
            }
        }

        var s1 = Singleton.instance

    }
}
