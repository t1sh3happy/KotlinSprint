package org.Evgeniy.KS_7_3

fun main() {
    println("Введите число : ")
    val interNum = readln().toInt()
    for (i in 0..interNum step 2) {
        println(i)
    }
}