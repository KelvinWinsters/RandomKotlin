package day_4_oop.shapes

class Rectangle(var width: Int, var height: Int) {
    val isSquare: Boolean
        get() = (width == height)

    val area: Int
        get() = (width * height)
}

fun main() {
    val r = arrayOf(Rectangle(1, 1), Rectangle(10, 12), Rectangle(25, 18), Rectangle(50, 36))
    for (x in 0..3) {
//        r[x].width = (x + 1) * 3
//        r[x].height = x + 5
        r[x].height
        r[x].width

        println("Rectangle $x has area ${r[x].area}")
//        println("It is $${if (r[x].isSquare) "" else "not"} a square.")
    }
}