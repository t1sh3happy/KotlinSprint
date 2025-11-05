package org.Evgeniy.KS_4_1

const val AMOUNT_TABLES = 13

fun main() {
    val tableBookingToday = 13
    val tableBookingTomorrow = 9

    val availableBookingToday = tableBookingToday < AMOUNT_TABLES
    val availableBookingTomorrow = tableBookingTomorrow < AMOUNT_TABLES

    println("Доступность столиков на сегодня: $availableBookingToday")
    println("Доступность столиков на завтра: $availableBookingTomorrow")
}