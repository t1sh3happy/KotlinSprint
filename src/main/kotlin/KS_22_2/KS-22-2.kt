package org.Evgeniy.KS_22_1

class RegularBook1(val title: String, val author: String)

data class DataBook1(val title: String, val author: String)

fun main() {
    val book1 = RegularBook1(title = "Kotlin Sprint", author = "Sprint Kotlin")
    val book2 = DataBook1(title = "Kotlin Sprint", author = "Sprint Kotlin")

    println(book1) // toString работает дефолтно, выводится полное имя класса и 16-ричное представление хэш-кода объекта
    println(book2) // toString переписан data-классом, чтобы получить читаемые данные

}
