package org.Evgeniy.KS_14_3

const val PI = 3.14159

abstract class Figure(val color: String) {
    abstract fun getSquare(): Double
    abstract fun getPerimetr(): Double

}

class Circle(color: String, val radius: Double) : Figure(color) {
    override fun getSquare(): Double {
        val square = PI * (radius * radius)
        println("Площадь круга равна : $square")
        return square
    }

    override fun getPerimetr(): Double {
        val perimetr = 2 * PI * radius
        println("Периметр круга равен : $perimetr")
        return perimetr
    }
}

class Rectangle(color: String, val shirina: Double, val visota: Double) : Figure(color) {
    override fun getSquare(): Double {
        val square = shirina * visota
        println("Площадь составляет $square")
        return square
    }

    override fun getPerimetr(): Double {
        val perimetr = 2 * (shirina + visota)
        println("Периметр составляет $perimetr")
        return perimetr
    }

}

fun main() {
    val figures: List<Figure> = listOf(
        Circle("black", 5.0),
        Circle("white", 3.0),
        Rectangle("black", 4.0, 6.0),
        Rectangle("white", 2.0, 8.0)
    )

    val blackPerimeters = figures
        .filter { it.color == "black" }
        .sumOf { it.getPerimetr() }
    println("Сумма периметров чёрных фигур: $blackPerimeters")

    val whiteSquare = figures
        .filter { it.color == "white" }
        .sumOf { it.getSquare() }
    println("Сумма площадей белых фигур: $whiteSquare")

}
