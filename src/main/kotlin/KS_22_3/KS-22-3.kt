package org.Evgeniy.KS_22_3

data class Order(val id: Int, val name: String, val price: Double, val amount: Int)

fun main() {
    val milkorder = Order(1, "Milk", 89.95, 15)
    val (id, name, price, amount) = milkorder
    println("ID = $id, Название = $name, Цена = $price руб., Количество = $amount")
}
