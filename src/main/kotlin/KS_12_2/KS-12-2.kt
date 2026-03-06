package org.Evgeniy.KS_12_2

class Weather(val dayTemperature: Int, val nightTemperature: Int, val isPrecipitation: Boolean) {
    fun printInfo() {
        println("температура днём: $dayTemperature, температура ночью: $nightTemperature, осадки: $isPrecipitation")
    }
}

fun main() {
    val day1 = Weather(30, 20, false)
        day1.printInfo()
}
