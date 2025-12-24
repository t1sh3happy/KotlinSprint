package org.Evgeniy.KS_8_3

fun main() {
    val ingredientsForPlov =
        arrayOf("говядина", "рис басмати", "морковь", "лук", "чеснок", "масло", "соль", "перец", "вода")
    print("Введите информацию об ингредиенте, который вы хотите найти: ")
    val usersIngredient = readln()

    if (ingredientsForPlov.contains(usersIngredient)) {
        println("Ингредиент [$usersIngredient] в рецепте есть")
    }
    else
        println("Такого ингредиента в рецепте нет")

}
