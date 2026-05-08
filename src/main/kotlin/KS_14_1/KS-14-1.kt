package org.Evgeniy.KS_14_1


open class Liner(
    open val speed: Int = 20,
    open val lifting: Int = 500,
    open val passengercapacity: Int = 3000,
) {
    open fun displayInfo() {
        println("Скорость: $speed")
        println("Грузоподъёмность: $lifting")
        println("Пассажировместимость: $passengercapacity")
    }
}

class CargoShip : Liner() {
    override val speed: Int = 15
    override val lifting: Int = 5000
    override val passengercapacity: Int = 300
}

class IceBreaker : Liner() {
    override val speed: Int = 10
    override val lifting: Int = 300
    override val passengercapacity: Int = 200
    fun breakIce() {
        println("Колю лёд!")
    }
}

fun main() {
    val liner = Liner()
    liner.displayInfo()

    val cargoShip = CargoShip()
    cargoShip.displayInfo()

    val iceBreaker = IceBreaker()
    iceBreaker.displayInfo()
    iceBreaker.breakIce()
}