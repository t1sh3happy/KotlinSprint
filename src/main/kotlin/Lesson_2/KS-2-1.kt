package org.Evgeniy.Lesson_2

fun main() {

    val gradeFirst: Byte = 3
    val gradeSecond: Byte = 4
    val gradeThird: Byte = 3
    val gradeFourth: Byte = 5

    val averageGrade: Double = (gradeFirst + gradeSecond + gradeThird + gradeFourth) / 4.0
    println(String.format("%.2f", averageGrade))
    // так как явно указано, что необходимо 2 знака
}