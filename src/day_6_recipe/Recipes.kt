package day_6_recipe

data class Recipe(val title: String, val isVegetarian: Boolean)

fun main(){
    val r1 = Recipe("Githeri",false)
    val r2 = Recipe("Suga",false)
    val r3 = Recipe("Mitoo",false)

    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")

    println("r1 == r2 ${r1 == r2}")
    println("r1 === r2 ${r1 === r2}")
    println("r1 == r3 ${r1 == r3}")
    val (title,vegetarian) = r1
    println("title is $title and vegetarian is $vegetarian")

    }