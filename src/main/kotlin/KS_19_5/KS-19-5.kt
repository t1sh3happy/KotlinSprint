package org.Evgeniy.KS_19_5

enum class Gender {
    MALE,
    FEMALE
}

class Person(val name: String, val gender: Gender)



fun main() {
val persons = mutableListOf<Person>()
    println("Введите своё имя а также пол на другой строке в формате ${Gender.entries.joinToString(", ")}")
    while (persons.size < 5) {
        println("Имя: ")
        val name = readln()
        println("ПОЛ:")
        val inputGender: String = readln()
        val gender = Gender.valueOf(inputGender)
        val person = Person(name, gender)
        persons.add(person)
    }

    println(persons.joinToString("\n") { "${it.name} — ${it.gender}" })

}
