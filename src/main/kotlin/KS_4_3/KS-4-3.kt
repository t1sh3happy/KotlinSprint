package org.Evgeniy.KS_4_3

const val IS_SUNNY_WEATHER = true
const val IS_TENT_OPEN = true
const val AIR_HUMIDITY = 20
const val SEASON = "зима"

fun main() {
    val weatherToday = true
    val isTentOpenToday = true
    val airHumidityToday = 20
    val seasonToday = "зима"
    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
            "${weatherToday && isTentOpenToday &&
                airHumidityToday == AIR_HUMIDITY &&
                seasonToday != SEASON
            } "
    )
}
