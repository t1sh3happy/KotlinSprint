package org.Evgeniy.KS_17_1

fun main() {
    val quiz = Quiz("Сколько пальцев на руке", "5")
    println(quiz.question)
    println(quiz.answer)
    quiz.answer = "4 у металлопрокатчика"
    println(quiz.answer)

}

class Quiz(question: String, answer: String) {
    val question: String = question
        get() = field
    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}
