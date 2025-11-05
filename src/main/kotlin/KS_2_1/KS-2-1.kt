package org.Evgeniy.KS_2_1

fun main() {
    val gradeFirst = 3
    val gradeSecond = 4
    val gradeThird: Byte = 3
    val gradeFourth: Byte = 5
    val totalStudents = 4
    val averageGrade = (gradeFirst + gradeSecond + gradeThird + gradeFourth).toDouble() / totalStudents
    println(String.format("%.2f", averageGrade))
}