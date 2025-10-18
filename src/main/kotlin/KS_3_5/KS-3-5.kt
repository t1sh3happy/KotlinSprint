package org.Evgeniy.KS_3_5

fun main() {
    val acceptString = "\"D2-D4;0\""
    val cleaned = acceptString.trim('"')
    val parts = cleaned.split("-", ";")
    val from = parts[0]
    val to = parts[1]
    val moveNumber = parts[2].toInt()
    println("откуда ход - $from")
    println("куда ход - $to")
    println("номер хода - $moveNumber")
}