package org.Evgeniy.KS_21_2

fun List<Int>.evenNumbersSum(): Int {

    return sumOf { if (it % 2 == 0) it else 0 }
}

fun main() {

    val list1 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(list1.evenNumbersSum())

    val list2 = emptyList<Int>()
    println(list2.evenNumbersSum())

    val list3 = listOf(1, 3, 5)
    println(list3.evenNumbersSum())

    val list4 = listOf(-2, -4, 3)
    println(list4.evenNumbersSum())

}
