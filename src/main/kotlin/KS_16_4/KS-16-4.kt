package org.Evgeniy.KS_16_4

fun main() {

    val order1 = Order(1)
    order1.sendToManager(order1, "В доставке")

}

class Order(val number: Int) {
    private var status: String = "Создан"
        private set

    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun sendToManager(order: Order, newStatus: String) {
        println(
            "Заявка менеджеру: по заказу ${order.number}, " +
                    "текущий статус - ${order.status}, поменять статус на $newStatus"
        )
        order.changeStatus(newStatus)
        println("Статус изменен на $newStatus")
    }
}
