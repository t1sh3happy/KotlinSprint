package org.Evgeniy.KS_12_1

class WeatherOfDay {
    var dayTemperature: Int = 0
    var nightTemperature: Int = 0
    var isPrecipitation: Boolean = false
    fun printInfo() {
        println("температура днём: $dayTemperature, температура ночью: $nightTemperature, осадки: $isPrecipitation")
    }
}

fun main() {
    val day1 = WeatherOfDay()
    val day2 = WeatherOfDay()
    day1.dayTemperature = 35
    day1.nightTemperature = 20
    day1.isPrecipitation = true
    day2.dayTemperature = 20
    day2.nightTemperature = 10
    day2.isPrecipitation = false
    day1.printInfo()
    day2.printInfo()
}