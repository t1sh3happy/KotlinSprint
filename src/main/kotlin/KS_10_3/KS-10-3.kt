package org.Evgeniy.KS_10_3

fun main() {
    print("Введите длинну пароля: ")
    val passLength = readln().toInt()

    println(generation(passLength))

}

fun generation(passLength: Int): String {
    val password = buildString {
        if (passLength % 2 == 0) {
            repeat(passLength / 2) {
                append(('0'..'9').random())
                append("!\"#\$%&()*+,-./ ".random())
            }
        } else {
            repeat(passLength / 2) {
                append(('0'..'9').random())
                append("!\"#\$%&()*+,-./ ".random())

            }
            append(('0'..'9').random())

        }

    }
    return password
}