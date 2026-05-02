package org.Evgeniy.KS_14_4

open class CelestialBody(
    val name: String,
    val atmosphere: Boolean,
    val isLandable: Boolean,
)

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean
) : CelestialBody(name, hasAtmosphere, isLandable)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean,
    val satellites: List<Satellite>
) : CelestialBody(name, hasAtmosphere, isLandable)

fun main() {
    val sputnik1 = Satellite("Кожух", true, true)
    val sputnik2 = Satellite("Жомух", false, false)

    val planet1 = Planet("Йонгулард", false, true, listOf(sputnik1, sputnik2))
    println("Название планеты ${planet1.name}")
    planet1.satellites.forEach {
        println("  Спутник: ${it.name}")

    }
}
