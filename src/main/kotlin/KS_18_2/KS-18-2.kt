package org.Evgeniy.KS_18_2

open class Dice {
    open fun roll() {}
}

class Dice4 : Dice() {
    override fun roll() = println("Выпало число: ${(1..4).random()}")
}

class Dice6 : Dice() {
    override fun roll() = println("Выпало число: ${(1..6).random()}")
}

class Dice8 : Dice() {
    override fun roll() = println("Выпало число: ${(1..8).random()}")
}

fun main() {
    val dices: List<Dice> = listOf(Dice4(), Dice6(), Dice8())
    for (dice in dices) {
        dice.roll()
    }
}
