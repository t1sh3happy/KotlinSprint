package org.Evgeniy.KS_9_1

fun main() {
    val listOfIngredients =
        listOf("говядина", "рис басмати", "морковь", "лук", "чеснок", "масло", "соль", "перец", "вода")

    println("В рецепте есть следующие ингредиенты: $listOfIngredients")

    listOfIngredients.forEach { ingredients ->
        println(ingredients)
    }
}
