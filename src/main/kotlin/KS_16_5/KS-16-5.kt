package org.Evgeniy.KS_16_5

fun main() {
    val player1 = Player("Alex", 100, 20)
    player1.takeDamage(50)
    player1.heal(30)
    player1.takeDamage(80)
    player1.heal(1000)
    player1.takeDamage(50)
    player1.heal(100)

}

class Player(
    val name: String,
    healthPoints: Int,
    strength: Int,
) {
    var healthPoints: Int = healthPoints
        private set
    var strength: Int = strength
        private set

    fun takeDamage(damage: Int) {
        if (healthPoints <= 0) {
            println("Игрок мёртв, действие невозможно")
            return
        }
        healthPoints -= damage

        println("Получено $damage урона, остаётся $healthPoints единиц здоровья")
        if (healthPoints <= 0) {
            die()
        }
    }

    fun heal(amount: Int) {
        if (healthPoints <= 0) {
            println("Игрок мёртв, действие невозможно")
            return
        }
        healthPoints += amount
        println("Игрок вылечен на $amount единиц здоровья. Итого $healthPoints единиц здоровья")
    }

    private fun die() {
        healthPoints = 0
        strength = 0
        println("Игрок Убит")
    }
}
