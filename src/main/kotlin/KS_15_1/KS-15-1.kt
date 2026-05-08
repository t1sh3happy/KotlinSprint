package org.Evgeniy.KS_15_1

fun main() {
    val crucian = Crucian()
    crucian.swim()
    val duck = Duck()
    duck.swim()
    duck.fly()
    val gull = Gull()
    gull.fly()
}

interface Swimmer {
    fun swim() {
        println("Плаваю")
    }
}

interface Flyer {
    fun fly() {
        println("Летаю")
    }
}


class Crucian : Swimmer

class Duck : Swimmer, Flyer

class Gull : Flyer
