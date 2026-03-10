package org.Evgeniy.KS_13_4

class PhoneDirectory4(
    val name: String,
    val phoneNumber: Long,
    val companyName: String?,
) {
    fun printInfo() {
        println("Имя: $name, Номер: +$phoneNumber, Компания: ${companyName ?: "не указано"}")
    }
}

fun main() {
    val phoneList = mutableListOf<PhoneDirectory4>()
    while (true) {
        var continuing = "да"
        println("Вы желаете ввести пользователя? Да/Нет")
        continuing = readln().lowercase()
        if (continuing == "нет") {
            break
        }
        println("Введите имя:")
        val name: String = readln()
        println("Введите номер телефона:")
        val phoneNumber: Long? = readln().toLongOrNull()
        if (phoneNumber == null) {
            println("Вы не ввели номер телефона")
            continue
        }
        println("Введите название компании:")
        var companyName: String? = readln()
        if (companyName == "") {
            companyName = null
        }
        phoneList.add(PhoneDirectory4(name, phoneNumber, companyName))

    }
    for (i in phoneList) {
        i.printInfo()
    }
}
