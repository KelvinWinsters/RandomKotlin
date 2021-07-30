package day_5_moreoop.animals.wildanimals

abstract class Animal() : Roamable {
    abstract val image: String
    abstract var food: String
    abstract var habitat: String
    var hunger = 10
    abstract fun makeNoise()

    abstract fun eat()

    override fun roam() {
        println("The Animal is roaming")
    }

    open fun sleep() {
        println("The Animal is sleeping")
    }
}