package org.Evgeniy.KS_16_2

import kotlin.math.pow

private const val PI = 3.14

fun main() {
    val circle1 = Circle(5.0)
    println("Длина круга составляет ${circle1.calculateLength()}")
    println("Площадь круга составляет ${circle1.calculateSquare()}")

}

class Circle(private val radius: Double) {

    fun calculateLength(): Double {
        return 2 * PI * radius
    }

    fun calculateSquare(): Double {
        return PI * radius.pow(2)
    }
}
