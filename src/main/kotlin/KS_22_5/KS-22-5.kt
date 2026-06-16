package org.Evgeniy.KS_22_5

data class GalacticGuide(val place: String, val placeDescription: String, val dateTime: String, val distance: Double)

fun main() {
    val galacticGuide = GalacticGuide(
        "Alpha Centauri",
        "это ближайшая к Солнечной системе звездная звезда. Она состоит из трех звезд: двух солнцеподобных (А и В) и красного карлика (Проксима Центавра)",
        "16.06.2026 21:24",
        4.35,
    )
    val (place, placeDescribe, date, distance) = galacticGuide
    println(
                "Место - $place, " +
                "Описание места : $placeDescribe, " +
                "дата и время: $date, " +
                "расстояние места от Земли в световых годах: $distance"
    )
}