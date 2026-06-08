package org.Evgeniy.KS_20_1

fun main() {

    val hello: (String) -> String = { username -> "С наступающим Новым Годом, $username!" }
    println(hello("Kesha"))

}