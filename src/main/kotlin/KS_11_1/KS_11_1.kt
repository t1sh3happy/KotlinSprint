package KS_11_1

class `KS-11-1`(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {
    val `KS-11-11` = `KS-11-1`(
        id = 12,
        login = "login",
        password = "password",
        email = "exampleMail@gmail.com"
    )

    val `KS-11-12` = `KS-11-1`(
        id = 14,
        login = "superlogin",
        password = "superpassword",
        email = "exampleGmail@gmail.com"
    )
    println(`KS-11-11`.id)
    println(`KS-11-11`.login)
    println(`KS-11-11`.password)
    println(`KS-11-11`.email)
    println()
    println(`KS-11-12`.id)
    println(`KS-11-12`.login)
    println(`KS-11-12`.password)
    println(`KS-11-12`.email)
}