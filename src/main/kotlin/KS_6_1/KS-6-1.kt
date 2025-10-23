package org.Evgeniy.KS_6_1

fun main() {

    print("Создайте логин : ")
    val login = readln().toString()
    print("Создайте пароль : ")
    val password = readln().toString()
    println("Вы успешно зарегистрировались")
    print("Введите логин : ")
    var inputLog = readln().toString()
    print("Введите пароль : ")
    var inputPass = readln().toString()

    while (login != inputLog) {
        print("Введите логин : ")
        inputLog = readln().toString()
    }

    while (password != inputPass) {
        print("Введите пароль : ")
        inputPass = readln().toString()
    }
    println("Авторизация прошла успешно")
}
