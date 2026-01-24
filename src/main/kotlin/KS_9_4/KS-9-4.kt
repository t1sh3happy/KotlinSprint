package org.Evgeniy.KS_9_4

fun main() {
    val ingredientsForPlov = arrayOf<String>()
    print("Введите 5 ингредиентов, перечисленных через “, ” (запятая с пробелом): ")
    val usersIngredients = readln()
    val listOfIngredients = usersIngredients.split(", ")
    val sortedList = listOfIngredients.sorted()
    sortedList.forEach {
        println(it)
    }

}
