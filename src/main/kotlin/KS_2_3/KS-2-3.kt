package org.Evgeniy.KS_2_3

const val HOURS_IN_DAY = 24
const val MINUTES_IN_HOUR = 60
fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelMinutes = 457
    val totalDepartureMinutes = departureHour * MINUTES_IN_HOUR + departureMinute
    val totalArriveMinutes = totalDepartureMinutes + travelMinutes
    val arrivalHour = (totalArriveMinutes / MINUTES_IN_HOUR) % HOURS_IN_DAY
    val arrivalMinute = totalArriveMinutes % MINUTES_IN_HOUR
    println("Время прибытия: $arrivalHour:$arrivalMinute")
}
//Сайт с расписанием поездов получает данные с сервера. Сервер посылает время выезда
// и время в пути, а время прибытия вычисляется из них. Сервер прислал данные,
// что поезд выехал в 9:39 и будет в пути 457 минут.
//
//– Создай целочисленные переменные и проинициализируй их этими данными;
//– Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
//– Выведи результат в консоль.