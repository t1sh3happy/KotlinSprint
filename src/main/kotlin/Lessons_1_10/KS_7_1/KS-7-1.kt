package org.Evgeniy.KS_7_1

fun main() {
    val password = buildString {
        repeat(3) {
            append(('a'..'z').random())
            append(('0'..'9').random())
        }
    }
    println(password)
}