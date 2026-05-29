package org.Evgeniy.KS_18_1

class Order(val number: Int) {
    fun showInfo(product: String) = "Заказан товар: $product"
    fun showInfo(products: List<String>) = "Заказаны следующие товары: ${products.joinToString(", ")}"
}


fun main() {

    val order1 = Order(1)
    println(order1.showInfo("Молоко"))

    val order2 = Order(2)
    println(order2.showInfo(listOf("Молоко", "Хлеб", "Сыр")))

}
