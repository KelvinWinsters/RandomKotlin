package day_5_moreoop.animals.homeapplicance

abstract class Appliance {
    var pluggedIn = true
    abstract val color: String
    abstract fun consumePower()
}
