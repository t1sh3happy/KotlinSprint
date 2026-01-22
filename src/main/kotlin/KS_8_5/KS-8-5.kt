package org.Evgeniy.KS_8_5

fun main() {
    print("Введите количество ингридиентов: ")
    val userNumber = readln().toInt()
    val userArray = Array<String>(userNumber) { "" }

    for (ingredient in userArray.indices) {
        println("Введите ингридиент ${ingredient + 1}: ")

        userArray[ingredient] = readln()

    }

    for (ingredient in userArray) println("Ингредиент ${userArray.indexOf(ingredient) + 1} : $ingredient")

}