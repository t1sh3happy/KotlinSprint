package org.Evgeniy.KS_15_2

fun main() {
    val temp = Temperature(25.5, "Москва")
    val precipitation = PrecipitationAmount(15.0, "Владивосток")
    val temp1 = Temperature(18.0, "Хабаровск")
    val precipitation1 = PrecipitationAmount(15.5, "Геленджик")
    val server = WeatherServer()
    server.send(temp)
    server.send(precipitation)
    server.send(temp1)
    server.send(precipitation1)
}

abstract class WeatherStationStats(val count: Double, val location: String) {
    abstract val unit: String
    fun formattedValue(): String {
        return if (count % 1.0 == 0.0) {
            "${count.toInt()}$unit"
        } else {
            "$count$unit"
        }
    }
}

class Temperature(count: Double, location: String) : WeatherStationStats(count, location) {
    override val unit: String = "°C"
}

class PrecipitationAmount(count: Double, location: String) : WeatherStationStats(count, location) {
    override val unit: String = "mm"
}

class WeatherServer {
    fun send(stat: WeatherStationStats) {
        when (stat) {
            is Temperature -> {
                println("Температура в городе ${stat.location} составляет ${stat.formattedValue()}")
            }

            is PrecipitationAmount -> {
                println("Осадки в городе ${stat.location} составляют ${stat.formattedValue()}")
            }
        }
    }
}