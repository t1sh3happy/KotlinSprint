package org.Evgeniy.KS_4_4

fun main() {
    val day = 5

    val isArmsAndAbs = day % 2 != 0
    val isLegsAndBack = !isArmsAndAbs

    val output = """
        |Упражнения для рук:       $isArmsAndAbs
        |Упражнения для ног:       $isLegsAndBack
        |Упражнения для спины:     $isLegsAndBack
        |Упражнения для пресса:    $isArmsAndAbs
    """.trimMargin()

    println(output)
}
