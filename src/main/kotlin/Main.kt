package org.Evgeniy

import KS_11_1.Person

fun main() {
    val person1 = Person(
        id = 12,
        login = "login",
        password = "password",
        email = "exampleMail@gmail.com"
    )

    val person2 = Person(
        id = 14,
        login = "superlogin",
        password = "superpassword",
        email = "exampleGmail@gmail.com"
    )
    println(person1.id)
    println(person1.login)
    println(person1.password)
    println(person1.email)
    println()
    println(person2.id)
    println(person2.login)
    println(person2.password)
    println(person2.email)
}