package org.Evgeniy.KS_8_4

fun main() {
    val ingredientsForPlov =
        arrayOf(
            "говядина", "рис басмати", "морковь", "лук",
            "чеснок", "масло", "соль", "перец", "вода")
    println("Список текущих ингридиентов: ")

    for (ingredient in ingredientsForPlov) {
        println(ingredient)
    }

    print("Введите информацию об ингредиенте, который вы хотите заменить: ")
    val usersIngredientInAll = readln()

    if (!(ingredientsForPlov.contains(usersIngredientInAll))) {
        println("Ингредиента [$usersIngredientInAll] нет в списке")
    } else {
        print("Введите ингредиент, который вы хотите добавить:")
        val usersIngredientFor = readln()
        val index = ingredientsForPlov.indexOf(usersIngredientInAll)
        ingredientsForPlov.set(index, usersIngredientFor)

        println("Обновленный список ингредиентов:")
        for (ingredient in ingredientsForPlov) {
            println(ingredient)
        }
    }

}
