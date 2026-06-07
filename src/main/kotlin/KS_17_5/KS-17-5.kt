package org.Evgeniy.KS_17_5

fun main() {
    val user1 = User("user1", "password1")
    println("Логин : ${user1.login}, пароль: ${user1.password}")
    user1.login = "user001"
    println("Логин : ${user1.login}, пароль: ${user1.password}")
    user1.password = "01"
    println("Логин : ${user1.login}, пароль: ${user1.password}")

}

class User(login: String, password: String) {
    var login: String = login
        set(value) {
            field = value
            println("Успешная смена логина")
        }
    var password: String = password
        set(value) = println("Вы не можете изменить пароль")
        get() {
            return "*".repeat(field.length)
        }

}
