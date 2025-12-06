package org.Evgeniy.KS_7_4



fun main() {
    print("Введите количество секунд, которые необходимо засечь : ")
    val interSec = readln().toInt()
    for (i in interSec downTo  0) {
        println("осталось секунд $i")
        Thread.sleep(1000)
    }
}