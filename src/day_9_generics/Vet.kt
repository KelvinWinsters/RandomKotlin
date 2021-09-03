package day_9_generics

class Vet<T:Pet> {
    fun treat(t :T){
        println("Treat Pet ${t.name}")
    }
}