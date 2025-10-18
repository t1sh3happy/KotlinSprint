package org.Evgeniy.KS_4_2

fun main() {
    val minimumWeightOfAverage = 35
    val maximumWeightOfAverage = 100
    val sizeOfAverage = 100
    var inputWeight = 20
    var inputSize = 80
    println("Груз весом $inputWeight кг и объемом $inputSize л соответствует категории 'Average': ${inputWeight > minimumWeightOfAverage && inputWeight <= maximumWeightOfAverage && inputSize <= sizeOfAverage}")
    inputWeight = 50
    inputSize = 100
    println("Груз весом $inputWeight кг и объемом $inputSize л соответствует категории 'Average': ${inputWeight > minimumWeightOfAverage && inputWeight <= maximumWeightOfAverage && inputSize <= sizeOfAverage}")
}