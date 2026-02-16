package org.Evgeniy.KS_5_2

import java.time.Year

const val AGE_OF_MAJORITY = 18

fun main() {
    print("Введите год рождения : ")
    val birthYear = readln().toInt()
    if (Year.now().value - birthYear >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Мал ещё")
}