package org.Evgeniy.KS_21_5

fun Map<String, Int>.maxCategory(): String? {

    return maxByOrNull { it.value }?.key
}


fun main() {
    val map1 = mapOf(
        "Чтение" to 95,
        "Сила" to 95,
        "Ловкость" to 24,
        "Интеллект" to 56,
        "Выносливость" to 78,
        "Чтение" to 95,
    )

    println(map1.maxCategory())
}