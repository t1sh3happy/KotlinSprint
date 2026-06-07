package org.Evgeniy.KS_19_2

enum class Category(val displayName: String) {
    CLOTHES("Одежда"),
    STATIONERY("Канцелярия"),
    SUNDRY("Разное");

    fun categoryInfo() = displayName

}

class Product(val title: String, val id: Int, val category: Category) {
    fun description() {
        println("Название товара: $title, id: $id, категория товара: ${category.categoryInfo()}")
    }
}


fun main() {

    val jeans = Product("Gloria", 1, Category.CLOTHES)
    jeans.description()
    val scissors = Product("Clips", 2, Category.STATIONERY)
    scissors.description()
    val repellent = Product("Reelliment", 3, Category.SUNDRY)
    repellent.description()
}
