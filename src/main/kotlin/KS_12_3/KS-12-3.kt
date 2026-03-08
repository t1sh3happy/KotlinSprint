package org.Evgeniy.KS_12_3

class Weather3(dayTemperatureKelvin: Int, nightTemperatureKelvin: Int, isPrecipitationParam: Boolean) {
    val celDayTemp: Int
    val celNightTemp: Int
    val isPrecipitation: Boolean

    init {
        celDayTemp = dayTemperatureKelvin - 273
        celNightTemp = nightTemperatureKelvin - 273
        isPrecipitation = isPrecipitationParam
    }

    fun printInfo() {
        println("температура днём: $celDayTemp, температура ночью: $celNightTemp, осадки: $isPrecipitation")
    }
}

fun main() {
    val day1 = Weather3(500, 780, false)
    day1.printInfo()
}
