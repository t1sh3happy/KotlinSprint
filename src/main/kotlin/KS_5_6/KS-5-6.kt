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
    val bodyMassIndex = inputWeight / ((inputHeight / CENTIMETERS_IN_METER) * (inputHeight / CENTIMETERS_IN_METER))
    print("Ваш индекс составляет : %.2f. Категория веса - ".format(bodyMassIndex))
    when {
        bodyMassIndex < UNDERWEIGHT -> println("Недостаточная масса тела")
        bodyMassIndex in UNDERWEIGHT..NORMAL_BODY_WEIGTH -> println("Нормальная масса тела")
        bodyMassIndex in NORMAL_BODY_WEIGTH..OVERWEIGHT -> println("Избыточная масса тела")
        bodyMassIndex > OVERWEIGHT -> println("Ожирение")
    }
}
