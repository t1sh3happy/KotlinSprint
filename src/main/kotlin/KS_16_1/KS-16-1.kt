package org.Evgeniy.KS_16_1

import kotlin.random.Random

fun main() {
    val cube1 = Cube()
    println("Число кубика ${cube1.getNumberOfCubes()}")

}

class Cube {
    private var numberOfCubes: Int = (1..6).random()
    fun getNumberOfCubes(): Int {
        return numberOfCubes
    }

}
