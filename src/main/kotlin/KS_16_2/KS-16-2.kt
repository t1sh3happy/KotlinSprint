package org.Evgeniy.KS_16_2

private const val PI = 3.14

fun main() {
    val circle1 = Circle(5.0)
    println("Длина круга составляет ${circle1.length()}")
    println("Площадь круга составляет ${circle1.square()}")

}

class Circle(private val radius: Double) {

    fun length(): Double {
        return 2 * PI * radius
    }

    fun square(): Double {
        return PI * (radius * radius)
    }
}
