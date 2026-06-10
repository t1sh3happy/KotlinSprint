package org.Evgeniy.KS_21_1

fun String.vowelCount(): Int {
    val vowels = "аеёиоуыэюяАЕЁИОУЫЭЮЯaeiouAEIOU"
    return count { it in vowels }
}


fun main() {

    println("привет".vowelCount())
    println("Spaceship".vowelCount())
}
