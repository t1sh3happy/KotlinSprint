package org.Evgeniy.KS_3_5

fun main() {
    val acceptSstring = "\"D2-D4;0\""
    val cleaned = acceptSstring.trim('"')
    val firstSplit = cleaned.split(";")

    val move = firstSplit[0]
    val numberMove = firstSplit[1].toInt()

    val  secondSplit = move.split("-")
    val from = secondSplit[0]
    val to = secondSplit[1]

    println("откуда ход - $from")
    println("куда ход - $to")
    println("номер хода - $numberMove")
}