package day_4_oop.pets

import java.util.*

class Dog(val name: String, weight_param: Int, breed_param: String) {
    init {
        println("Dog $name has been created")
    }

    var activities = arrayOf("Walks")
    var breed = breed_param.uppercase(Locale.getDefault())

    init {
        println("The breed is $breed")
    }

    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }
    val weightInKgs: Double
        get() = weight / 2.0

    fun bark() {
        println(if (weight < 20) "Yip" else "Woof")
    }
}

fun main() {
    val myDog = Dog("Bosco", 70, "Mixed")
    myDog.bark()
    println("Weight is ${myDog.weight}")
    myDog.weight = 80
    println("Weight in Kgs is ${myDog.weightInKgs}")
    myDog.weight = -2
    println("Weight is ${myDog.weight}")
    myDog.activities = arrayOf("walks", "Fetching balls", "Frisbee")
    for (item in myDog.activities) {
        print { "My dog enjoys $item" }
    }

    val dogs = arrayOf(Dog("Bosco", 20, "German"), Dog("Simba", 17, "Poodle"))
    dogs[1].bark()
    dogs[1].weight = 15
    println("Weight for ${dogs[1].name} is ${dogs[1].weight}")
    println("Weight for ${dogs[0].name} is ${dogs[0].weight}")
}












