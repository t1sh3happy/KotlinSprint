package org.Evgeniy.KS_9_4

fun main() {
    print("Введите 5 ингредиентов, перечисленных через \", \" (запятая с пробелом): ")
    val listOfIngredients = readln().split(", ").sorted()
    listOfIngredients.forEach {
        println(it)
    }

}
