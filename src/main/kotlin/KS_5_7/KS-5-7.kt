package org.Evgeniy.KS_5_7

fun main() {

    print("Введите расстояние поездки (в километрах): ")
    val inputDistance = readln().toDouble()
    print("Введите расход топлива на 100 км (в литрах): ")
    val inputConsumption = readln().toDouble()
    print("Введите текущую цену за литр топлива: ")
    val inputPrice = readln().toDouble()
    val totalFuel = (inputDistance * inputConsumption) / 100
    val totalCost = inputPrice * totalFuel
    println(
        """
            Общее количество необходимого топлива равна $totalFuel
            Общая стоимость поездки ${"%.2f".format(totalCost)} тугриков
        """.trimIndent()
    )
}
