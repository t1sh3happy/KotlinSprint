package org.Evgeniy.KS_15_3

fun main() {
    val bashka = User("Башка")
    val admin1 = Admin("admin")
    val admin2 = Admin("admin2")
    bashka.writeMessage()
    admin1.writeMessage()
    bashka.readMessage()
    admin1.readMessage()
    admin1.deleteMessage()
    admin1.deleteUser(bashka)
    admin2.writeMessage()
    admin1.deleteUser(admin2)
}

abstract class UserOfForum(val login: String) {
    fun readMessage() {
        println("Пользователь $login прочитал сообщение")
    }

    fun writeMessage() {
        println("Пользователь $login создал сообщение")
    }

}

class Admin(login: String) : UserOfForum(login) {
    fun deleteMessage() {
        println("Сообщение $login удалено")
    }

    fun deleteUser(user: UserOfForum) {

        println("Пользователь ${user.login} удалён")
    }
}

class User(login: String) : UserOfForum(login)
