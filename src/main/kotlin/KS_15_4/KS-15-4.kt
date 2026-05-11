package org.Evgeniy.KS_15_4


fun main() {
    val guitar = MusicalInstrument("guitar", 2)
    val guitarString = Component("Guitar string", 20)
    guitar.findComponents(guitarString)
    val drum = MusicalInstrument("drum", 1)
    val drumsticks = Component("Drumsticks", 30)
    drum.findComponents(drumsticks)
}

abstract class Product(val name: String, val stockCount: Int)

class MusicalInstrument(name: String, stockCount: Int) : Product(name, stockCount), Searcher

class Component(name: String, stockCount: Int) : Product(name, stockCount)

interface Searcher {
    fun findComponents(component: Component) {
        println("Выполняется поиск ${component.name}")
    }
}
