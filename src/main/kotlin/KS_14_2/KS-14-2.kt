package org.Evgeniy.KS_14_2

open class NewPassangerLiner(
    open val speed: Int = 20,
    open val lifting: Int = 500,
    open val passengercapacity: Int = 3000,

    ) {
    open fun displayInfo() {
        println("Скорость: $speed")
        println("Грузоподъёмность: $lifting")
        println("Пассажировместимость: $passengercapacity")
    }

    open fun shipment() {
        println("выдвигает горизонтальный трап со шкафута")
    }
}

class NewCargoShip : NewPassangerLiner() {
    override val speed: Int = 15
    override val lifting: Int = 5000
    override val passengercapacity: Int = 300

    override fun shipment() {
        println("грузовой корабль активирует погрузочный кран")
    }
}

class NewIceBreaker : NewPassangerLiner() {
    override val speed: Int = 10
    override val lifting: Int = 300
    override val passengercapacity: Int = 200
    fun breakIce() {
        println("Колю лёд!")
    }

    override fun shipment() {
        println("ледокол открывает ворота со стороны кормы")
    }
}

fun main() {
    val liner = NewPassangerLiner()
    liner.displayInfo()
    liner.shipment()

    val cargoShip = NewCargoShip()
    cargoShip.displayInfo()
    cargoShip.shipment()

    val iceBreaker = NewIceBreaker()
    iceBreaker.displayInfo()
    iceBreaker.breakIce()
    iceBreaker.shipment()
}