package day_5_moreoop.animals.homeapplicance

class CoffeeMaker : Appliance() {
    override val color = ""
    var coffeeLeft = false

    override fun consumePower() {
        println("Consuming power")
    }

    fun fillWithWater() {
        println("Fill with water")
    }

    fun makeCoffee() {
        println("Make the coffee")
    }
}