package org.Evgeniy.KS_10_5

const val CORRECT_LOGIN = "superuser"
const val CORRECT_PASSWORD = "superpassword"
var userCart = listOf("Молоко", "Хлеб", "Яблоки")
val tokensStorage = mutableMapOf<String, String>()
const val CHARACTERS_IN_TOKEN = 32

fun main() {
    val testlogin = "superuser"
    val testpassword = "superpassword"
    val token = authorize(testlogin, testpassword)
    if (token == null) {
        println("Ошибка логина или пароля")
    } else {
        val cart = getCart(token)
        if (cart == null) {
            println("Ошибка доступа к корзине")
        } else {
            println("Содержимое корзины: $userCart")
        }
    }
}

fun authorize(login: String, password: String): String? {
    if (login == CORRECT_LOGIN && password == CORRECT_PASSWORD) {
        val generativeToken = generate(login)
        tokensStorage[generativeToken] = login
        return generativeToken
    } else {
        return null
    }

}

fun generate(login: String): String {
    val digits = ('a'..'z').plus('A'..'Z').plus('0'..'9')
    val token = buildString {
        repeat(CHARACTERS_IN_TOKEN) {
            append(digits.random())
        }

    }
    return token

}

fun getCart(token: String): List<String>? {

    if (!tokensStorage.containsKey(token)) {
        return null
    } else {
        return userCart
    }

}
