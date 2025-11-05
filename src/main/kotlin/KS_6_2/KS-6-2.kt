package org.Evgeniy.KS_6_2

const val MILLISECONDS = 1000

fun main() {

    print("Введите количество секунд, которые нужно засечь: ")
    val seconds = readln().toInt()
    val waitTIme = (seconds * MILLISECONDS)
    Thread.sleep(waitTIme.toLong())
    println("Прошло $seconds секунд")
}
