package org.Evgeniy.KS_16_2

fun main() {
    val circle1 = Circle(5.0)
    println("Длина круга = ${circle1.circleLenght()}")
    println("Площадь круга = ${circle1.circleSquare()}")

}

class Circle(radiuss: Double) {
    var radius: Double = radiuss
        private set
    var Pi = 3.14
        private set

    fun circleLenght(): Double {
        return (2 * Pi * radius)
    }

    fun circleSquare(): Double {
        return (2 * Pi * (radius * radius))
    }
}
