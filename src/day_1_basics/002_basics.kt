package day_1_basics

fun main() {
    val x = 5
    val y = 7
    println(if (x > y) "$x is greater" else "$y is greater")
    println("Done here, Call another function")
    exercise()
}

fun exercise() {
    var x = 0
    var y = 0
    while (x < 5) {
//        y = x - y //1
//        y += x //2
//        y += 3 //3
//        if (y > 4) y -= 1 //3
//        x += 2  //4
//        y += x  //4

        if (y < 5) {
            x += 1
            if (y < 3) x -= 1
        }
        y += 3
        print(" $x$y ")
        x += 1
    }
}