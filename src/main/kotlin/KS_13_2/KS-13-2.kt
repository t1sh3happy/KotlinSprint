package org.Evgeniy.KS_13_2

class PhoneDirectory2(
    val name: String,
    val phoneNumber: Long,
    var companyName: String? = null,
) {
    fun printInfo() {
        println("Имя: $name, Номер: +$phoneNumber, Компания: ${companyName ?: "не указано"}")
    }
}

fun main() {
    val newDirectory = PhoneDirectory2("Ростислав", 79684413658)
    newDirectory.printInfo()
}
