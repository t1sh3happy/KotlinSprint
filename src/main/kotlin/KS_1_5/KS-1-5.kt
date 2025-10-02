package org.Evgeniy.KS_1_5

//Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
//
//- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
//- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
//- Значения часов, минут и секунд отображать двумя цифрами.

fun main() {

    val secondsInSpace: Short = 6480
    val hours: Short = (secondsInSpace / 3600).toShort()
    val remainSecondsAfterHour: Short = (secondsInSpace % 3600).toShort()
    val minutes: Short = (remainSecondsAfterHour / 60).toShort()
    val seconds: Short = (remainSecondsAfterHour % 60).toShort()

    println(String.format("%02d:%02d:%02d", hours, minutes, seconds))
}