package org.Evgeniy.KS_18_2

abstract class Dice {
    abstract val sides: Int
    fun roll() = println("Выпало число: ${(1..sides).random()}")
}

class Dice4 : Dice() {
    override val sides = 4
}

class Dice6 : Dice() {
    override val sides = 6
}

class Dice8 : Dice() {
    override val sides = 8
}

fun main() {
    val dices: List<Dice> = listOf(Dice4(), Dice6(), Dice8())
    for (dice in dices) {
        dice.roll()
    }
}
