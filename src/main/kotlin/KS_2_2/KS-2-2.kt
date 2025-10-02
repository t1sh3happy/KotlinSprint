package org.Evgeniy.KS_2_2

//В компании работало 50 человек с зарплатой по 30000 рублей. Затем в компанию устроилось 30 стажеров,
// которым назначили зарплату в 20000 рублей каждому. Пишем часть гипотетического софта для бухгалтерии, который будет считать:
//
//– Расходы на выплату зарплаты постоянных сотрудников;
//– Общие расходы по ЗП после прихода стажеров;
//– Среднюю ЗП одного сотрудника после устройства стажеров.
//
//Каждый пункт посчитать и сохранить в переменную с соответствующим названием. Все значения необходимо вывести в виде целых чисел.
const val permamentEmployeeCount: Int = 50
const val permamentEmployeeSalary: Int = 30000
const val internCount: Int = 20
const val internSalary: Int = 20000

fun main() {
    val spendPermamentEmployee = permamentEmployeeCount * permamentEmployeeSalary
    val spendForIntern = internCount * internSalary
    val spendWithIntern = spendForIntern + spendPermamentEmployee
    val averageSpend = (spendWithIntern / (permamentEmployeeCount + internCount)).toInt()

    println("Расходы на выплату зарплаты постоянных сотрудников - $spendPermamentEmployee")
    println("Общие расходы по ЗП после прихода стажеров - $spendWithIntern")
    println("Среднюю ЗП одного сотрудника после устройства стажеров - $averageSpend")

}