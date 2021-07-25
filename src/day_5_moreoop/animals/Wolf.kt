package day_5_moreoop.animals

class Wolf : Canine() {
    override var image = "wolf.jpg"
    override var food = "meat"
    override var habitat = "forest"

    override fun makeNoise() {
        print("Hooooow!")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }
}

fun main() {
    val kk = Wolf()
    println(kk.makeNoise())
    println(kk.roam())
}