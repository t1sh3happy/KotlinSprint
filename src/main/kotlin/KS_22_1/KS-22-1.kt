package org.Evgeniy.KS_22_1

class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)

fun main() {
    val book1 = RegularBook(title = "Kotlin Sprint", author = "Sprint Kotlin")
    val book2 = RegularBook(title = "Kotlin Sprint", author = "Sprint Kotlin")
    val book3 = DataBook(title = "Kotlin Sprint", author = "Sprint Kotlin")
    val book4 = DataBook(title = "Kotlin Sprint", author = "Sprint Kotlin")
    val book5 = book4

    println(book1 == book2)         //equals работает дефолтно, по ссылке  между первым и вторым экземплярами класса RegularBook,
    println(book3 == book4)         //сравниваются по значению между первым и вторым экземплярами класса DataBook

}
