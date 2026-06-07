package org.Evgeniy.KS_18_5

class Screen {

    fun draw(figure: Circle, x: Int, y: Int) = "Нарисована фигура - $figure по координатам X: $x Y: $y"

    fun draw(figure: Circle, x: Float, y: Float) = "Нарисована фигура - $figure по координатам X: $x Y: $y"

    fun draw(figure: Square, x: Int, y: Int) = "Нарисована фигура - $figure по координатам X: $x Y: $y"

    fun draw(figure: Square, x: Float, y: Float) = "Нарисована фигура - $figure по координатам X: $x Y: $y"

    fun draw(figure: Point, x: Int, y: Int) = "Нарисована фигура - $figure по координатам X: $x Y: $y"

    fun draw(figure: Point, x: Float, y: Float) = "Нарисована фигура - $figure по координатам X: $x Y: $y"

}

class Circle {
    override fun toString() = "Круг"
}

class Square {
    override fun toString() = "Квадрат"
}

class Point {
    override fun toString() = "Точка"
}

fun main() {
    val screen = Screen()

    println(screen.draw(Circle(), 5, 10))
    println(screen.draw(Square(), 5, 10))
    println(screen.draw(Point(), 5, 10))
    println(screen.draw(Circle(), 15.4f, 50.4f))
    println(screen.draw(Square(), 25.3f, 30.1f))
    println(screen.draw(Point(), 35.12f, 30.05f))

}
