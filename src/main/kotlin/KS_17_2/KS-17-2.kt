package org.Evgeniy.KS_17_2

fun main() {
    val ship = Ship("ПОбеда", "Сан-Мартин", 20)
    println("Название корабля - ${ship.shipName}, порт - ${ship.port}, скорость -  ${ship.averageSpeed}")
    ship.shipName = "Боевой бурят"
    println(ship.shipName)
    ship.port = "Карибские острова"
    ship.averageSpeed = 299
    println("Название корабля - ${ship.shipName}, порт - ${ship.port}, скорость -  ${ship.averageSpeed}")
}

class Ship(shipName: String, var port: String, var averageSpeed: Int) {
    var shipName: String = shipName
        set(value) = println("Невозможно изменить имя корабля")

}
