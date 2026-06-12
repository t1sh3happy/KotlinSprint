package org.Evgeniy.KS_21_4

import java.io.File

fun File.prependWord(word: String) {
    if (exists()) {
        val content = word.lowercase() + "\n" + readText()
        writeText(content)
    } else {
        writeText(word.lowercase())
    }
}

fun main() {
    val file = File("dictionary.txt")

    file.prependWord("first")
    println("после 1: [${file.readText()}]")

    file.prependWord("second")
    println("после 2: [${file.readText()}]")

    println(File("dictionary.txt").readText())
    println(file.absolutePath)
}
