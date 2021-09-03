package day_4_oop.aquarium

fun main() {
    buildAquarium()
    makeFish()
}

fun buildAquarium() {
    val myAquarium = Aquarium()

    println("Length ${myAquarium.length} Width ${myAquarium.width} Height ${myAquarium.height}")
    println("Volume ${myAquarium.volume} litres")

    val smallAq = Aquarium(30, 25, 40)
    println("Volume ${smallAq.volume} litres")

    val myAquarium2 = Aquarium(27)
    println(
        "Small Aquarium 2: ${myAquarium2.volume} " +
                "litres Length ${myAquarium2.length} Width ${myAquarium2.width} Height ${myAquarium2.height}"
    )

}

fun makeFish() {
    val shark = Shark()
    val whale = Whale()
    println("The shark is ${shark.color} in color and the whale is ${whale.color}")
//    println("The shark eats $shark and the whale eats $whale")
}
