package org.Evgeniy.KS_15_5

fun main() {
    val car1 = Car()
    val car2 = Car()
    val car3 = Car()
    val truck = Truck()
    val truck2 = Truck()
    car1.loadPassengers(3)
    car2.loadPassengers(3)
    car3.loadPassengers(4)
    car1.moveTo()
    car2.moveTo()
    car3.moveTo()
    car1.unloadPassengers(3)
    car2.unloadPassengers(3)
    car3.unloadPassengers(4)
    truck.loadCargo(2)
    truck2.loadCargo(3)
    truck.moveTo()
    truck2.moveTo()
    truck.loadPassengers(1)
    truck.unloadPassengers(1)
    truck.unloadCargo(2)
    truck2.unloadCargo(3)

}

class Car : Movable,
    PassengerCarrier {
    override val maxPassengers: Int = 3
    override var currentPassengers: Int = 0
}

class Truck : Movable, CargoCarrier,
    PassengerCarrier {
    override val maxCargo: Int = 2
    override var currentCargo: Int = 0
    override val maxPassengers: Int = 1
    override var currentPassengers: Int = 0
}

interface Movable {
    fun moveTo() {
        println("Двигаюсь по дороге")
    }
}

interface PassengerCarrier {
    val maxPassengers: Int
    var currentPassengers: Int
    fun loadPassengers(count: Int) {
        if (currentPassengers + count <= maxPassengers) {
            currentPassengers += count
            println("Загружено $count пассажиров. Всего: $currentPassengers/$maxPassengers")
        } else {
            println("Не помещается! Свободно: ${maxPassengers - currentPassengers}")
        }
    }

    fun unloadPassengers(count: Int) {
        if (currentPassengers - count >= 0) {
            currentPassengers -= count
            println("Выгружено $count пассажиров. Всего: $currentPassengers/$maxPassengers")
        } else {
            println("Неправильно введено количество выгружаемых пассажиров")
        }
    }

}

interface CargoCarrier {
    val maxCargo: Int
    var currentCargo: Int
    fun loadCargo(count: Int) {
        if (currentCargo + count <= maxCargo) {
            currentCargo += count
            println("Загружено $count т. Всего: $currentCargo/$maxCargo")
        } else {
            println("Не помещается! Свободно: ${maxCargo - currentCargo}")
        }
    }

    fun unloadCargo(count: Int) {
        if (count <= currentCargo) {
            currentCargo -= count
            println("Выгружено $count т. Всего: $currentCargo/$maxCargo")
        } else {
            println("Неправильно введено количество выгружаемого груза")
        }

    }
}
