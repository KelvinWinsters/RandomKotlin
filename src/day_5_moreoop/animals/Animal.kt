package day_5_moreoop.animals

open class Animal() {
    open val image = ""
    open var food = ""
    open var habitat = ""
    var hunger = 10
    open fun makeNoise() {
        println("The Animal is making a noise")
    }

    open fun eat() {
        println("The Animal is eating")
    }

    open fun roam() {
        println("The Animal is roaming")
    }

    open fun sleep() {
        println("The Animal is sleeping")
    }
}