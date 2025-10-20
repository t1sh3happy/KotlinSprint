package org.Evgeniy.KS_5_1

fun main() {
    val firstTerm = (0..10).random()
    val secondTerm = (0..10).random()
    print("Введите решение примера $firstTerm + $secondTerm : ")
    val total = readln().toInt()

    if (firstTerm + secondTerm == total) println("Добро пожаловать!")
     else println("Доступ запрещен")
}