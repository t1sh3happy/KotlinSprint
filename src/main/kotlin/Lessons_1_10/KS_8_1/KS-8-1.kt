package org.Evgeniy.KS_8_1

fun main() {
    val viewsMonday = 190
    val viewsTuesday = 120
    val viewsWednesday = 190
    val viewsThursday = 150
    val viewsFriday = 160
    val viewsSaturday = 170
    val viewsSunday = 180

    val arrayWiewsForWeek =
        arrayOf(viewsMonday, viewsTuesday, viewsWednesday, viewsThursday, viewsFriday, viewsSaturday, viewsSunday)
    var sum = 0

    for (i in arrayWiewsForWeek) {
        sum += i
    }
    println("Всего за неделю - $sum просмотров")


}
//Скрипт считает количество просмотров рекламы за день.
//Напиши программу, которая сохраняет в массив данные просмотров за неделю
//(числа использовать на свое усмотрение).
//Каждая ячейка хранит количество просмотров за день.
//Имея массив с данными, нужно посчитать сколько всего было просмотров за неделю.
//Результат вычислений выведи в консоль.