package org.Evgeniy.KS_8_5

fun main() {
    print("Введите количество ингридиентов: ")
    val userNumber = readln().toInt()
    var userArray = Array<String>(userNumber) { "" }

    for (ingredient in userArray) {
        println("Введите ингридиент ${userArray.indexOf(ingredient) + 1}: ")
        userArray[userArray.indexOf(ingredient)] = readln()

    }

    for (ingredient in userArray)
        println("Ингредиент ${userArray.indexOf(ingredient) + 1} : $ingredient")

}