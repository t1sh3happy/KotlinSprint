package KS_6_3

const val MILLISECONDS = 1000

fun main() {
    print("Введите количество секунд, которые нужно засечь: ")
    var seconds = readln().toInt()

    while (seconds > 0) {
        println("Осталось секунд: ${seconds--}")
        Thread.sleep(MILLISECONDS.toLong())
    }
    println("Время вышло")

}
