package org.Evgeniy.KS_5_1

fun main() {
    val a = (Math.random() * 10).toInt()
    val b = (Math.random() * 10).toInt()
    print("Введите решение примера $a + $b : ")
    val c = readLine()!!.toInt()
    if (a + b == c) println("Добро пожаловать!")
    else println("Доступ запрещен")
}
