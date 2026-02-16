package org.Evgeniy.KS_9_3

fun main() {
    val listOfIngredients = mutableListOf<Int>(2, 50, 15)

    println(
        "Для одной порции нужно: " + "яиц – ${listOfIngredients[0]} шт." + "молока – ${listOfIngredients[1]} мл." + " сливочного масла – ${listOfIngredients[2]} гр."
    )

    print("Введите количество порций: ")
    val userPortions = readln().toIntOrNull()
    if (userPortions == null) {
        println("Ошибка. Вы не ввели число")
        return
    }
    val totalIngredients = listOfIngredients.map { it * userPortions }

    println(
        "На количество из $userPortions проций вам понадобится  " + "яиц – ${totalIngredients[0]} шт." + "молока – ${totalIngredients[1]} мл." + " сливочного масла – ${totalIngredients[2]} гр."
    )

}

