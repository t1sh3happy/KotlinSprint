package org.Evgeniy.KS_6_5

fun main() {

    var counter = 3
    do {
        val firstNumber = (1..9).random()
        val secondNumber = (1..9).random()
        print("Введите сумму чисел $firstNumber и $secondNumber : ")
        val inputNumber = readln().toInt()

        if (inputNumber == firstNumber + secondNumber) {
            println("Добро пожаловать!")
            return
        } else {
            counter--
            println("Неверно. Оставшееся количество попыток $counter")
        }

    } while (counter > 0)

    println("Доступ запрещен")

}
