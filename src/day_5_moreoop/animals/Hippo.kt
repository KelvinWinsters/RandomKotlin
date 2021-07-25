package day_5_moreoop.animals

class Hippo : Animal() {
    override val image = "hippo.jpg"
    override var food = "grass"
    override var habitat = "water"

    override fun makeNoise(){
        println("Grunt Grunt")
    }

    override fun eat(){
        println("The hippo is eating $food")
    }

}

