package org.Evgeniy.KS_19_5

enum class Gender {
    MALE,
    FEMALE,
}

class Person(val name: String, val gender: Gender) {

    fun printInfo() = println("Имя $name, пол $gender")

}

fun main() {
    val persons = mutableListOf<Person>()
    println("Введите своё имя а также пол. Доступные значения: MALE, FEMALE")
    while (persons.size < 5) {
        println("Имя: ")
        val name = readln()
        println("ПОЛ:")
        var inputGender: String = readln()

        while (inputGender != (Gender.MALE.name) && inputGender != (Gender.FEMALE.name)) {
            println("Вы ошиблись, повторите ввод доступных значений: MALE, FEMALE")
            inputGender = readln()
        }

        val gender = Gender.valueOf(inputGender)
        val person = Person(name, gender)
        persons.add(person)
    }

    for (person in persons) {
        person.printInfo()
    }

}
