package org.Evgeniy.KS_7_2

fun main() {
    val smsCode = (1000..9999).random()
    println("Ваш код авторизации: $smsCode")

    println("Введите код авторизации : ")
    val interCode = readln().toInt()
    while (interCode != smsCode) {
        println("Ваш код авторизации: $smsCode")
        println("Введите код авторизации : ")
        val interCode = readln().toInt()

        if (interCode == smsCode) {
            println("Добро пожаловать")
            return
        }
    }
}

