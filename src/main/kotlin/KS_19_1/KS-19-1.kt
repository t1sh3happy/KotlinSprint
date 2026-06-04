package org.Evgeniy.KS_19_1

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun main() {
println("Вы можете добавить в свой аквариум следующих рыб: ${Fish.entries.joinToString() }}")
}