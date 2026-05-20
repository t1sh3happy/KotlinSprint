package org.Evgeniy.KS_16_4

fun main() {

    val order1 = Order(1)
    order1.sendToManager("В доставке")

}

class Order(private val number: Int) {
    private var status: String = "Создан"
        private set

    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun sendToManager(newStatus: String) {
        println(
            "Заявка менеджеру: по заказу $number, " +
                    "текущий статус - $status, поменять статус на $newStatus"
        )
        changeStatus(newStatus)
        println("Статус изменен на $newStatus")
    }
}
