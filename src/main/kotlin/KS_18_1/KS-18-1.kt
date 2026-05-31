package org.Evgeniy.KS_18_1

class Order(val number: Int) {

    fun displayOrder(product: String) {
        println("Заказан товар: $product")
    }

    fun displayOrder(products: List<String>) {
        println("Заказаны следующие товары: ${products.joinToString(", ")}")
    }
}


fun main() {

    val order1 = Order(1)
    order1.displayOrder("Молоко")

    val order2 = Order(2)
    order2.displayOrder(listOf("Молоко", "Хлеб", "Сыр"))

}
