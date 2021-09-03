package day_8_collections

fun main() {
    println("Hello World")
    var arrays = arrayOf(1, 2, 3, 4, 5)
    println(arrays) // prints the address and not the values
    println(arrays.size)

    println("Before reverse")
    for (i in arrays) {
        println(i)
    }
    arrays.reverse()
    println("After reverse")
    for (i in arrays) {
        println(i)
    }

    println("The max value is ${arrays.maxOrNull()}")
    println("The min value is ${arrays.minOrNull()}")
    var sum = arrays.sum()
    println(sum)
}