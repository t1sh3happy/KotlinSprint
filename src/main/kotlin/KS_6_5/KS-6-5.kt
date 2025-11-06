package org.Evgeniy.KS_6_1

fun main() {

    var counter = 3
    do {
        val firstNumber = (1..9).random()
        val secondNumber = (1..9).random()
        val sum = firstNumber + secondNumber
        print("Введите сумму чисел $firstNumber и $secondNumber : ")
        val inputNumber = readln().toInt()

        if (inputNumber == sum) {
            println("Добро пожаловать!")
            break
        } else if (counter == 0) {
            println("Доступ запрещен")
        } else {
            counter--
            println("Неверно, предлагаю решить заново. Оставшееся количество попыток $counter")
            }

    } while (counter > 0)

}
