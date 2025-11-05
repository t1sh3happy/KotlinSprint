package org.Evgeniy.KS_3_4

fun main() {
    var vertical = 'E'
    var horizontal = 2
    var from = "$vertical$horizontal"
    var to = "$vertical${4}"
    var moveNumber = 1
    println("[$from-$to;$moveNumber]")


    vertical = 'D'
    horizontal = 2
    from = "$vertical$horizontal"
    to = "$vertical${horizontal + 1}"
    moveNumber++
    print("Следующий ход белых - ")
    println("[$from-$to;$moveNumber]")

}