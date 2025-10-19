package org.Evgeniy.KS_4_3

fun main() {
    val isSunnyWeather = true
    val isTentOpen = true
    val airHumidity = 20
    val season = "не зима"
    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
            "${isSunnyWeather &&
                isTentOpen &&
                airHumidity == 20 &&
                season != "зима"}"
    )
    val weatherToday = true
    val isTentOpenToday = true
    val airHumidityToday = 20
    val seasonToday = "зима"
    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
            "${weatherToday == isSunnyWeather &&
                isTentOpenToday == isTentOpen &&
                airHumidityToday == airHumidity &&
                seasonToday != "зима"
            } "
    )
}
