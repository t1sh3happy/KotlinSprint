package org.Evgeniy.KS_19_4

enum class Shell(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20);
}

class Tank {
    var loadedShell: Shell? = null

    fun load(shell: Shell) {
        println("Снаряд $loadedShell заменён на: $shell")
        loadedShell = shell
    }

    fun shoot() {
        if (loadedShell == null) {
            println("Танк не заряжен")
        } else {
            println("Нанесено урона: ${loadedShell?.damage}")
        }
    }
}

fun main() {

    val tank = Tank()
    tank.shoot()
    tank.load(Shell.GREEN)
    tank.shoot()
    tank.load(Shell.RED)
    tank.shoot()
    tank.load(Shell.BLUE)
    tank.shoot()
}
