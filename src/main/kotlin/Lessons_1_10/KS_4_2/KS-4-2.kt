package org.Evgeniy.KS_4_2

const val MINIMUM_WEIGHT_OF_AVERAGE = 35
const val MAXIMUM_WEIGHT_OF_AVERAGE = 100
const val SIZE_OF_AVERAGE = 100
fun main() {
    var inputWeight = 20
    var inputSize = 80
    println(
        "Груз весом $inputWeight кг и объемом $inputSize л соответствует категории 'Average': " +
            "${
                inputWeight > MINIMUM_WEIGHT_OF_AVERAGE &&
                    inputWeight <= MAXIMUM_WEIGHT_OF_AVERAGE &&
                    inputSize <= SIZE_OF_AVERAGE
            }"
    )
    inputWeight = 50
    inputSize = 100
    println(
        "Груз весом $inputWeight кг и объемом $inputSize л соответствует категории 'Average': " +
            "${
                inputWeight > MINIMUM_WEIGHT_OF_AVERAGE &&
                    inputWeight <= MAXIMUM_WEIGHT_OF_AVERAGE &&
                    inputSize <= SIZE_OF_AVERAGE
            }"
    )
}
