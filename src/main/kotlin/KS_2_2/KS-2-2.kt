package org.Evgeniy.KS_2_2

//В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров,
// которым назначили зарплату в 20000 рублей каждому. Пишем часть гипотетического софта для бухгалтерии, который будет считать:
//
//– Расходы на выплату зарплаты постоянных сотрудников;
//– Общие расходы по ЗП после прихода стажеров;
//– Среднюю ЗП одного сотрудника после устройства стажеров.
//
//Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в виде целых чисел.
const val PERMAMENT_EMPLOYEE_COUNT: Int = 50
const val PERMAMENT_EMPLOYEE_SALARY: Int = 30000
const val INRERN_COUNT: Int = 20
const val INTERN_SALARY: Int = 20000

fun main() {
    val spendPermamentEmployee = PERMAMENT_EMPLOYEE_COUNT * PERMAMENT_EMPLOYEE_SALARY
    val spendForIntern = INRERN_COUNT * INTERN_SALARY
    val spendWithIntern = spendForIntern + spendPermamentEmployee
    val averageSpend = (spendWithIntern / (PERMAMENT_EMPLOYEE_COUNT + INRERN_COUNT)).toInt()

    println("Расходы на выплату зарплаты постоянных сотрудников - $spendPermamentEmployee")
    println("Общие расходы по ЗП после прихода стажеров - $spendWithIntern")
    println("Среднюю ЗП одного сотрудника после устройства стажеров - $averageSpend")

}