package KS_6_4

fun main() {
    val number = (1..9).random()
    var counter = 5
    var inputNumber: Int

    do {
        print("Угадайте число от 1 до 9: ")
        inputNumber = readln().toInt()
        --counter
        if (inputNumber == number) {
            println("Это была великолепная игра!")
            return
        } else {
            println("Неверно, оставшееся количество попыток $counter")
        }

    } while (counter > 0)
    if (inputNumber != number) {
        println("Вы проиграли. Было загадано число: $number")
    }
}