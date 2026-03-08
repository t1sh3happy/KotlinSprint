package org.Evgeniy.KS_12_5

import kotlin.random.Random

class Weather5(dayTemperatureKelvin: Int, nightTemperatureKelvin: Int, isPrecipitationParam: Boolean) {
    val celDayTemp: Int
    val celNightTemp: Int
    val isPrecipitation: Boolean

    init {
        celDayTemp = dayTemperatureKelvin - 273
        celNightTemp = nightTemperatureKelvin - 273
        isPrecipitation = isPrecipitationParam
        printInfo()
    }

    fun printInfo() {
        println("температура днём: $celDayTemp, температура ночью: $celNightTemp, осадки: $isPrecipitation")
    }
}

fun main() {
    val weatherList = mutableListOf<Weather5>()

    for (i in 1..30) {
        weatherList.add(
            Weather5(
                dayTemperatureKelvin = (293..310).random(),
                nightTemperatureKelvin = (283..300).random(),
                isPrecipitationParam = Random.nextBoolean(),
            )
        )
    }

    val dayTemps = weatherList.map { it.celDayTemp }
    val nightTemps = weatherList.map { it.celNightTemp }
    val avgDay = dayTemps.average()
    val avgNight = nightTemps.average()
    val rainyDays = weatherList.count { it.isPrecipitation == true }

    println("Средняя дневная температура : $avgDay, " +
            "Средняя ночная температура $avgNight, " +
            "Количество дней с осадками: $rainyDays")

}
