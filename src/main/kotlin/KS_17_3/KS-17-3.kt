package org.Evgeniy.KS_17_3

fun main() {
    val hiddenFolder = Folder("Скрытая папка", 20, true)
    println("Имя папки ${hiddenFolder.name}, количество файлов ${hiddenFolder.fileCount}")
    val justFolder = Folder("Просто папка", 20, false)
    println("Имя папки ${justFolder.name}, количество файлов ${justFolder.fileCount} ")
}

class Folder(name: String, fileCount: Int, isHidden: Boolean) {
    val name: String = name
        get() = if (isHidden) "Скрытая папка" else field
    val fileCount: Int = fileCount
        get() = if (isHidden) 0 else field
    private val isHidden = isHidden

}
