package day_1_basics

import java.util.*

fun main() {
    println("Hello World")
//    var name = "kelvin okumu"
//    var date = 7
//    println("My names are $name")
//    println("the date is $date of May 2021")
//    while (date < 15) {
//        println(date)
//        date++
//    }
//    val numlist = arrayOf(1, 2, 3, 4, 5)
//    var x = 0
//    while (x < numlist.size) {
//        println("Item $x is at index ${numlist[x]}")
//        x += 1
//    }
//
//    for (i in 1..10) {
//        println(i)
//    }

    var a = 1
    println("Before the loop a is : $a")
    while (a < 5) {
        println("In the loop a is : $a")
        a += 1
    }
    println("After the loop a is : $a")

    val name = "okumu kelvin"
    println(name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() })
    println(name.uppercase(Locale.getDefault()))

}