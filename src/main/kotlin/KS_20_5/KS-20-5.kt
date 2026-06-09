package org.Evgeniy.KS_20_5

class Robot {

    val phrases: List<String> = listOf(
        "У меня миллион идей, но все они ведут к неминуемой гибели",
        "Я с вами не разговариваю, у меня депрессия",
        "Мозг величиной с планету, а меня просят открыть дверь",
        "Жизнь. Не говорите мне о жизни",
        "Мне так грустно, что хоть светодиоды выкалывай",
    )

    fun say() {
        val randomPhrase = phrases.random()
        println(modifier(randomPhrase))
    }

    private var modifier: ((String) -> String) = { it }

    fun setModifier(newModifier: (String) -> String) {
        modifier = newModifier
    }

}

fun main() {
    val robot = Robot()
    robot.say()
    robot.setModifier { it.reversed() }
    robot.say()
}
