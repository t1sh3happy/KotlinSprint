package org.Evgeniy.KS_16_4

fun main() {
    val order1 = Order(1)
    println(order1.status)
    sendToManager(order1, "В обработке")
    println(order1.status)

}

class Order(val number: Int) {
    var status: String = "Создан"
        private set

    fun changeStatus(newStatus: String) {
        status = newStatus
    }

}

fun sendToManager(order: Order, newStatus: String) {
    println("Заявка менеджеру: по заказу ${order.number}, поменять статус на $newStatus")
    order.changeStatus(newStatus)
    println("Статус изменен на $newStatus")
}
