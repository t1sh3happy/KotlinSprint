package org.Evgeniy.KS_17_3

fun main() {
    val folder1 = Folder("Папка", 20, false)
    println("Имя папки ${folder1.name}, количество файлов ${folder1.fileCount}, скрытность: ${folder1.isHidden}")
    folder1.isHidden = true
    println("Имя папки ${folder1.name}, количество файлов ${folder1.fileCount}, скрытность: ${folder1.isHidden}")
}

class Folder(name: String, fileCount: Int, isHidden: Boolean) {
    val name: String = name
        get() = if (isHidden) "Скрытая папка" else field
    var fileCount: Int = fileCount
        get() = if (isHidden) 0 else field
    var isHidden = isHidden

}
