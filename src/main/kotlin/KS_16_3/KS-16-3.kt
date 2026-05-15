package org.Evgeniy.KS_16_3

fun main() {
    val user1 = User("login", "password")
    if (user1.validate("ы")) {
        println("Вы указали верный пароль")
    } else {
        println("Пароль неверный")
    }
}


class User(val login: String, private val password: String) {


    fun validate(input: String): Boolean {
        return password == input
    }
}
