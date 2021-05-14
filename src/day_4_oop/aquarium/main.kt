package day_4_oop.aquarium

fun main() {
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium()

    println("Length ${myAquarium.length} Width ${myAquarium.width} Height ${myAquarium.height}")

    println("Volume ${myAquarium.volume} litres")
}
