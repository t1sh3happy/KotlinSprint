package org.Evgeniy.KS_10_2

fun main() {
    print("Введите логин: ")
    val userLogin = readln()
    print("Введите пароль: ")
    val userPass = readln()
    if (validation(userLogin) && validation(userPass))
    {
        println("Добро пожаловать")
    }
    else   {println("Логин или пароль недостаточно длинные")}
}

fun validation(input: String): Boolean {

    val count = input.length
    if (count > 4) {
        return true
    } else {
        return false
    }
}