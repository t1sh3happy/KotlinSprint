package org.Evgeniy.KS_4_5

const val HAS_DAMAGE = true
const val MIN_CREW_COUNT = 55
const val MAX_CREW_COUNT = 70
const val MIN_PROVISION_BOXES = 50
const val IS_FAVORABLE_WEATHER = true

fun main() {
    print("Имеются повреждения корабля? (true/false): ")
    val isDamaged = readln().toBoolean()
    print("Введите количество экипажа: ")
    val crewCount = readln().toInt()
    print("Введите количество ящиков с провизией на борту: ")
    val provisionBoxes = readln().toInt()
    print("Благоприятна погода? (true /false): ")
    val isFavorableWeather = readln().toBoolean()

    if ((
            isDamaged != HAS_DAMAGE &&
                crewCount >= MIN_CREW_COUNT &&
                crewCount <= MAX_CREW_COUNT &&
                provisionBoxes > MIN_PROVISION_BOXES
            ) ||
        (
            isDamaged == HAS_DAMAGE &&
                crewCount == MAX_CREW_COUNT &&
                isFavorableWeather == IS_FAVORABLE_WEATHER
            )
    ) {
        println("Корабль может отправиться в плавание")
    } else {
        println("Корабль не может отправиться в плавание")
    }
}
