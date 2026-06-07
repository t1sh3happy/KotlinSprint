package org.Evgeniy.KS_19_1

enum class Fish(val nameFish: String) {
    GUPPY("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}

fun main() {
    println("Вы можете добавить в свой аквариум следующих рыб: ${Fish.entries.joinToString { it.nameFish }}")
}
