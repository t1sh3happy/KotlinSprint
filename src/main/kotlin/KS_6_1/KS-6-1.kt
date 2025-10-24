package org.Evgeniy.KS_6_1

fun main() {

    print("Создайте логин : ")
    val login = readln()
    print("Создайте пароль : ")
    val password = readln()
    println("Вы успешно зарегистрировались")

    do {
        print("Введите логин : ")
        var inputLog = readln()
        print("Введите пароль : ")
        var inputPass = readln()

    } while (inputLog != login && inputPass != password)
}
