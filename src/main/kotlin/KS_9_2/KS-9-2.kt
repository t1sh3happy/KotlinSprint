package org.Evgeniy.KS_9_2

fun main() {
    val listOfIngredients =
        mutableListOf("яйца", "масло", "соль")

    println("В рецепте есть базовые ингредиенты: $listOfIngredients")

    print("Желаете добавить еще?: ")
    val userAnswer = readln()

    if (userAnswer.equals("да", true)){
        print("Какой ингредиент вы хотите добавить?: ")
        val userIngredient = readln()
        listOfIngredients.add(userIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients")
    }

    else {
        return
    }

}

