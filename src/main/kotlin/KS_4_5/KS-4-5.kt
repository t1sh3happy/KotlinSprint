package org.Evgeniy.KS_4_5

fun main() {
    print("Имеются повреждения корабля? (true/false): ")
    val isDamage = readLine()?.toBoolean() ?: false
    print("Введите количество экипажа: ")
    val crewCount = readLine()?.toIntOrNull() ?: 0
    print("Введите количество ящиков с провизией на борту: ")
    val provisionBoxes = readLine()?.toIntOrNull() ?: 0
    print("Благоприятна погода? (true /false): ")
    val weatherToday = readLine()?.toBoolean() ?: false

    val canSail =
        (!isDamage && crewCount in 55..70 && provisionBoxes > 50) ||
            (isDamage && crewCount == 70 && weatherToday == true && provisionBoxes >= 50)
    if (canSail) {
        println("Корабль может отправиться в плавание")
    } else {
        println("Корабль не может отправиться в плавание")
    }
}
