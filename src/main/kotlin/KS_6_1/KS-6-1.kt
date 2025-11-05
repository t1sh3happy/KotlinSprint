package org.Evgeniy.KS_6_1

fun main() {

    print("Создайте логин : ")
    val login = readln()
    print("Создайте пароль : ")
    val password = readln()
    println("Вы успешно зарегистрировались")

    do {
        print("Введите логин : ")
        val inputLog = readln()
        print("Введите пароль : ")
        val inputPass = readln()

    } while (inputLog != login || inputPass != password)

    println("Авторизация прошла успешно")

}
