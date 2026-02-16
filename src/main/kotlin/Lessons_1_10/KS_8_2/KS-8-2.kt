package org.Evgeniy.KS_8_2


fun main() {
    val ingredientsForPlov =
        arrayOf("говядина", "рис басмати", "морковь", "лук", "чеснок", "масло", "соль", "перец", "вода")
    print("Введите информацию об ингредиенте, который вы хотите найти: ")
    val usersIngredient = readln()

    for (ingredient in ingredientsForPlov) {
        if (ingredient.equals(usersIngredient)) {
            println("Ингредиент [$usersIngredient] в рецепте есть")
            return
        }


    }
    println("Такого ингредиента в рецепте нет")


}
