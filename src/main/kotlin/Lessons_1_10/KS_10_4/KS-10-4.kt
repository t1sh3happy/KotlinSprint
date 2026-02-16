package org.Evgeniy.KS_10_4

fun main() {
    var winCount = 0
    do {
        val userCount = getNumber()
        println("Вы бросаете кости и ваше число составляет $userCount")
        val compCount = getNumber()
        println("Компьютер бросает кости и его число составляет $compCount")

        if (userCount == compCount) {
            println("Победила дружба")
        } else if (userCount < compCount) {
            println("Победила машина")
        } else {
            println("Победили кожанные")
            winCount++
        }
    } while (takeRound())
    print("Кожанные победили $winCount раз ")
}

fun getNumber(): Int = (1..6).random().toInt()

fun takeRound(): Boolean {
    print("Хотите бросить кости ещё раз? Введите Да или Нет: ")
    val answer = readln()
    if (answer.equals("Да", ignoreCase = true)) {
        return true
    } else {
        return false
    }
}
