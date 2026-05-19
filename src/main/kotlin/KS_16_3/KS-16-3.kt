package org.Evgeniy.KS_16_3

fun main() {
    val user1 = User("login", "password")
    if (user1.validate("password")) {
        println("Вы указали верный пароль")
    } else {
        println("Пароль неверный")
    }
}

class User(private val login: String, private val password: String) {

    fun validate(input: String): Boolean = password == input
}
