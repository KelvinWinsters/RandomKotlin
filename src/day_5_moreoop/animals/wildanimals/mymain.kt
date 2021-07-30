package day_5_moreoop.animals.wildanimals

fun main() {
//    val animals = arrayOf(Hippo(), Wolf())
//    for (item in animals) {
//        item.roam()
//        item.eat()
//    }
//    val vet = Vet()
//    val wolf = Wolf()
//    val hippo = Hippo()
//    vet.giveShot(wolf)
//    vet.giveShot(hippo)

//    val animal: Animal = Wolf()
//    if (animal is Wolf) {
//        animal.eat()
//    }

    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables) {
        item.roam()
        if(item is Animal){
            item.eat()
        }
    }


}