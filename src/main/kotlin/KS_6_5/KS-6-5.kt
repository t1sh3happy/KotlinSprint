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
    var counter = 3
    do {
        val firstNumber = (1..9).random()
        val secondNumber = (1..9).random()
        val sum = firstNumber + secondNumber
        print("Введите сумму чисел $firstNumber и $secondNumber ")
        val inputNumber = readln().toInt()
        counter--

        if (inputNumber == sum) {
            println("Добро пожаловать!")
            break
        } else if (counter == 0) {
            println("Доступ запрещен")
        } else {println("Неверно, предлагаю решить заново. Оставшееся количество попыток $counter")}

    } while (counter > 0)

}
