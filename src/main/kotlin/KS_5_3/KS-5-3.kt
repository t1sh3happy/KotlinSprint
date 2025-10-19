package org.Evgeniy.KS_5_3

fun main() {
    val firstNum = 29
    val secondNum = 38
    val winNum = "Выигрышные числа $firstNum и $secondNum"
    println("Вы играете в лотерею, вам необходимо угадать два числа от 0 до 42")
    print("Введите первое число : ")
    val inputNumOne = readln().toIntOrNull() ?: 0
    print("Введите второе число : ")
    val inputNumTwo = readln().toIntOrNull() ?: 0

    when {
        (inputNumOne == firstNum && inputNumTwo == secondNum) ||
        (inputNumOne == secondNum && inputNumTwo == firstNum) ->
            println("Поздравляем! Вы выиграли главный приз")

        inputNumOne == firstNum || inputNumOne == secondNum ||
        inputNumTwo == secondNum || inputNumTwo == firstNum -> {
            println("Вы выиграли утешительный приз!")
            println(winNum)
        }

        else -> {
            println("Неудача!")
            println(winNum)
        }
    }
}
