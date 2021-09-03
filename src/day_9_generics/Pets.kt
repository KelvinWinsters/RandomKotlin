package day_9_generics

abstract class Pet(var name: String)

class Fish(name: String) : Pet(name)

class Dog(name: String) : Pet(name)

class Cat(name: String) : Pet(name)

fun main() {
    val catFuzz = Cat("Fuzz")
    val policeDog = Dog("Rex")
    val catJutsu = Cat("Karate")
    val fishDiver = Fish("Long Dive")

    val catVet = Vet<Cat>()
    val fishVet = Vet<Fish>()
    val petVet = Vet<Pet>()

    catVet.treat(catJutsu)
    petVet.treat(policeDog)
    petVet.treat(fishDiver)


    val catContest = Contest<Cat>(catVet)
    catContest.addScore(catFuzz, 56)
    catContest.addScore(catJutsu, 46)
    val topCat = catContest.getWInners().first()
    println("Cat contest winner is ${topCat.name}")

    val petContest = Contest<Pet>(petVet)
    petContest.addScore(policeDog, 150)
    petContest.addScore(catFuzz, 78)
    petContest.addScore(fishDiver, 91)
    val topPet = petContest.getWInners().first()
    println("Pet contest winner is ${topPet.name}")

    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val petRetailer: Retailer<Cat> = CatRetailer()
    petRetailer.sell()
    dogRetailer.sell()

}
