package org.Evgeniy.KS_12_4

class Weather4(dayTemperatureKelvin: Int, nightTemperatureKelvin: Int, isPrecipitationParam: Boolean) {
    val celDayTemp: Int
    val celNightTemp: Int
    val isPrecipitation: Boolean

    init {
        celDayTemp = dayTemperatureKelvin - 273
        celNightTemp = nightTemperatureKelvin - 273
        isPrecipitation = isPrecipitationParam
        println("температура днём: $celDayTemp, температура ночью: $celNightTemp, осадки: $isPrecipitation")
    }
}

fun main() {
    val day1 = Weather4(500, 780, false)
}
