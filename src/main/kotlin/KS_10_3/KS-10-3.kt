package org.Evgeniy.KS_10_3

fun main() {
    print("Введите длинну пароля: ")
    val passLength = readln().toInt()

    println(generate(passLength))

}

fun generate(passLength: Int): String {
    val digits = '0'..'9'
    val symbols = "!\"#\$%&()*+,-./ "
    val password = buildString {
        repeat(passLength / 2) {
            append(digits.random())
            append(symbols.random())
        }
        if (passLength % 2 != 0) {
            append(digits.random())
        }

    }
    return password
}