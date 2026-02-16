package org.Evgeniy.KS_11_2

class `KS-11-2`(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null,


    ) {
    fun printInfo() {
        println("Ваш ID -  $id, ваш логин -  $login, ваш пароль -  $password, ваш email -  $email, bio -  $bio ")
    }

    fun setBio() {
        println("Ваш bio - $bio, желаете его изменить? Да/Нет")
        val answer = readln().lowercase()
        if (answer == "да") {
            println("Введите на что вы хотите поменять:")
            val newBio = readln()
            bio = newBio

        } else {
            println("Оставляем имеющийся")
        }

    }

    fun changePassword() {
        println("Чтобы изменить ваш пароль введите текущий:")
        val tekPassword = readln()
        if (tekPassword == password) {
            println("Введите на что вы хотите поменять:")
            val newPassword = readln()
            password = newPassword
            println("Ваш новый пароль: $newPassword")
        } else {
            println("Пароль введён неверно")
        }

    }
}

fun main() {
    val user2 = `KS-11-2`(
        id = 12,
        login = "login",
        password = "password",
        email = "exampleMail@gmail.com"
    )

    user2.printInfo()
    user2.setBio()
    user2.changePassword()
    user2.printInfo()
}