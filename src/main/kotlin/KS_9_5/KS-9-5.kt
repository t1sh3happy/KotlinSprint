package org.Evgeniy.KS_9_5

fun main() {
    val ingredientsSet =
        mutableSetOf<String>()


    var countIngredients = 0
    while(countIngredients < 5) {
        print("Введите ингредиент ${countIngredients + 1} :")
        val userIngredient = readln()
        ingredientsSet.add(userIngredient.lowercase())
        countIngredients++
    }

    val result = ingredientsSet
        .sorted()
        .mapIndexed { index, string ->
            if (index == 0) {
                string.replaceFirstChar { it.uppercase() }
                } else { string }
        }
        .joinToString (", ")
    println(result)

}