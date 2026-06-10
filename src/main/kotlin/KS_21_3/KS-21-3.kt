package org.Evgeniy.KS_21_3

class Player(val name: String, var currentHealth: Int, val maxHealth: Int)

val healingPotion: (Player) -> Unit = { it.currentHealth = it.maxHealth }


fun main() {
    val hero = Player("bob", 20, 100)
    println("Имя игрока: ${hero.name}")
    println("Максимальное здоровье: ${hero.maxHealth}")
    println("Текущее здоровье: ${hero.currentHealth}")
    println(hero.isHealthy())
    healingPotion(hero)
    println("Текущее здоровье: ${hero.currentHealth}")
    println(hero.isHealthy())
}

fun Player.isHealthy(): Boolean {
    return this.currentHealth == this.maxHealth
}