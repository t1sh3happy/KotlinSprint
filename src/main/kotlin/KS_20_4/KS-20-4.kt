package org.Evgeniy.KS_20_4


fun main() {

    val strings: List<String> = listOf("Hello", "World", "Kotlin", "Java")

    val result = strings.map { it -> { println("Нажат элемент $it") } }
    result.forEachIndexed { index, show -> if (index % 2 == 0) show() }
}
