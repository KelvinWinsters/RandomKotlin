package day_4_oop.aquarium

abstract class AquariumFish {
    abstract val color: String
}

interface FishAction {
    fun eat()
}

class Shark() : AquariumFish(), FishAction {
    override val color: String = "Blue"
    override fun eat() {
        println("Hunt anything")
    }
}

class Whale() : AquariumFish(), FishAction {
    override val color: String = "Grey"
    override fun eat() {
        println("Feed on fish")
    }
}
