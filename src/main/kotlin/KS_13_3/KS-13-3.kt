package org.Evgeniy.KS_13_3

class PhoneDirectory3(
    val name: String,
    val phoneNumber: Long,
    var companyName: String? = null,
)

fun main() {
    val phoneList = listOf<PhoneDirectory3>(
        PhoneDirectory3("Дмитрий", 79995471123),
        PhoneDirectory3("Игорь", 79995541233),
        PhoneDirectory3("Владимир", 79548972123, "null"),
        PhoneDirectory3("Ангелина", 79996541123, "VK"),
        PhoneDirectory3("Владлен", 79683655411, "Gameloft")
    )
    val companyList = phoneList.map { it.companyName }
    println("Все существующие компании : $companyList")
}
