package org.Evgeniy.KS_20_4


fun main() {

    val strings: List<String> = listOf("Hello", "World", "Java", "Kotlin", "Python")

    val result = strings.map { { println("Нажат элемент $it") } }
    result.forEachIndexed { index, show -> if (index % 2 == 1) show() }


}
