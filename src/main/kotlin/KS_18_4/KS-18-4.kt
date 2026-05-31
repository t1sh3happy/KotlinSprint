package org.Evgeniy.KS_18_4

import kotlin.math.pow

abstract class Parcel {

    abstract fun surfaceArea(): Double
}

class RectangleBox(
    val length: Double,
    val width: Double,
    val height: Double
) : Parcel() {

    override fun surfaceArea(): Double = 2 * ((length * width) + (width * height) + (height * length))
}

class CubeBox(val edge: Double) : Parcel() {
    override fun surfaceArea(): Double = 6 * edge.pow(2)

}


fun main() {
    val parcels: List<Parcel> = listOf(
        RectangleBox(2.0, 3.0, 4.0),
        CubeBox(2.0)
    )
    for (parcel in parcels) {
        println("Площадь поверхности = ${parcel.surfaceArea()}")
    }
}
