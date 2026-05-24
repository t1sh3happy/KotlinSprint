package org.Evgeniy.KS_17_4

fun main() {
    val shipment1 = Shipment(1, "в обработке")
    println(
        "Посылка номер ${shipment1.number}  текущий статус: " +
                "${shipment1.currentLocation},  " +
                "количество изменений статуса: ${shipment1.moveCount} "
    )
    shipment1.currentLocation = "прибыло в сортировочный центр"
    println(
        "Посылка номер ${shipment1.number}  текущий статус: " +
                "${shipment1.currentLocation},  " +
                "количество изменений статуса: ${shipment1.moveCount}"
    )
    shipment1.currentLocation = "покинуло сортировочный центр"
    println(
        "Посылка номер ${shipment1.number}  текущий статус: " +
                "${shipment1.currentLocation},  " +
                "количество изменений статуса: ${shipment1.moveCount} "
    )
}

class Shipment(val number: Int, currentLocation: String) {
    var moveCount: Int = 0
        private set
    var currentLocation = currentLocation
        set(value) {
            field = value
            moveCount++
        }

}
