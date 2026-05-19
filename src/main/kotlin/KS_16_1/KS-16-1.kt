package org.Evgeniy.KS_16_1

fun main() {
    val cube1 = Cube()
    cube1.showNumber()

}

class Cube {
    private val number: Int = (1..6).random()
    fun showNumber(): Unit {
        println("Выпало число ${number}")
    }

}
