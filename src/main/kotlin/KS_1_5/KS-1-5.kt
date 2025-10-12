package org.Evgeniy.KS_1_5

//Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
//
//- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
//- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
//- Значения часов, минут и секунд отображать двумя цифрами.
const val SECOND_IN_MINUTE = 60
const val SECOND_IN_HOUR = 3600

fun main() {
    val secondsInSpace: Short = 6480
    val hours: Short = (secondsInSpace / SECOND_IN_HOUR).toShort()
    val remainSecondsAfterHour: Short = (secondsInSpace % SECOND_IN_HOUR).toShort()
    val minutes: Short = (remainSecondsAfterHour / SECOND_IN_MINUTE).toShort()
    val seconds: Short = (remainSecondsAfterHour % SECOND_IN_MINUTE).toShort()

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}