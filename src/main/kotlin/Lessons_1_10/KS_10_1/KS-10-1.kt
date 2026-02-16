package org.Evgeniy.KS_10_1

fun main() {

    val userCount = getnumber()
    println("Вы бросаете кости и ваше число составляет $userCount")
    val compCount = getnumber()
    println("Компьютер бросает кости и его число составляет $compCount")

    if (userCount == compCount) {
        println("Победила дружба")
    } else if (userCount < compCount) {
        println("Победила машина")
    } else {
        println("Победили кожанные")
    }

}

fun getnumber(): Int = (1..6).random().toInt()