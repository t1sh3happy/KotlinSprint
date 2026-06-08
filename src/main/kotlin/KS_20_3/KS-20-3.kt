package org.Evgeniy.KS_20_3

class Player(val hasKey: Boolean)

val checkKey: (Player) -> String = { if (it.hasKey) "Игрок открыл дверь" else "Дверь заперта" }


fun main() {
    val hero1 = Player(true)
    println(checkKey(hero1))
    val hero2 = Player(false)
    println(checkKey(hero2))
}
