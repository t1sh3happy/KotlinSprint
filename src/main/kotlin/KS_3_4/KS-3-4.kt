package org.Evgeniy.KS_3_4

fun main() {
    var vertical = 'E'
    var horizontal = 2
    var from = "$vertical$horizontal"
    var to = "$vertical${4}"
    var moveNumber = 1
    var move = "$from-$to, номер хода - $moveNumber"
    println(move)

    vertical = 'D'
    horizontal = 2
    from = "$vertical$horizontal"
    to = "$vertical${horizontal + 1}"
    moveNumber++
    move = "$from-$to, номер хода - $moveNumber"
    println("Следующий ход белых $move")

}