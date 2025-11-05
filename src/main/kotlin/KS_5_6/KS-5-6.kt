package org.Evgeniy.KS_5_6

const val UNDERWEIGHT = 18.5
const val NORMAL_BODY_WEIGTH = 25.0
const val OVERWEIGHT = 30.0
const val CENTIMETERS_IN_METER = 100

fun main() {
    print("Введите ваш вес в кг : ")
    val inputWeight = readln().toDouble()
    print("Введите ваш рост в см : ")
    val inputHeight = readln().toDouble()
    val heightInMeters = inputHeight / CENTIMETERS_IN_METER
    val bodyMassIndex = inputWeight / (heightInMeters * heightInMeters)
    print("Ваш индекс составляет : %.2f. Категория веса - ".format(bodyMassIndex))

    when {
        bodyMassIndex < UNDERWEIGHT -> println("Недостаточная масса тела")
        bodyMassIndex < NORMAL_BODY_WEIGTH -> println("Нормальная масса тела")
        bodyMassIndex < OVERWEIGHT -> println("Избыточная масса тела")
        else -> println("Ожирение")
    }
}
