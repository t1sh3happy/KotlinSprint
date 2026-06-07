package org.Evgeniy.KS_18_3

abstract class Animal(val name: String) {

    abstract val food: String

    fun eatFood() {
        println("$name -> ест $food")
    }

    fun sleep() { //зачем, если не используется?
        println("$name спит")
    }
}

class Fox(name: String) : Animal(name) {
    override val food = "ягоды"
}

class Dog(name: String) : Animal(name) {
    override val food = "кости"
}

class Cat(name: String) : Animal(name) {
    override val food = "рыбу"
}


fun main() {

    val animals: List<Animal> = listOf(
        Fox("Хитрец"),
        Dog("Барбос"),
        Cat("Гуга")
    )
    for (animal in animals) {
        animal.eatFood()
    }

}
