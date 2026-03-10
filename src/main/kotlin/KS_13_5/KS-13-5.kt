package org.Evgeniy.KS_13_5

class PhoneDirectory5(
    val name: String,
    val phoneNumber: Long,
    val companyName: String?,
) {
    fun printInfo() {
        println("Имя: $name, Номер: +$phoneNumber, Компания: ${companyName ?: "не указано"}")
    }
}

fun main() {

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

        try {
            val phoneNumber: String = readln()
            phoneNumber.toLong()
        } catch (e: Exception) {
            println(e.message)
            println(e::class.simpleName)
            continue
        }
        println("Введите название компании:")
        var companyName: String? = readln()
        if (companyName == "") {
            companyName = null
        }
    }
}
