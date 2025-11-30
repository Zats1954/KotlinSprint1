package org.example.lesson_1

fun main() {
    val firstCosmosManYear = 1961
    var hour = "09"
    var minute = "17"

    println(" год полета Юрия Гагарина в космос $firstCosmosManYear")
    println(" час взлета Юрия Гагарина в космос $hour")
    println(" минута взлета Юрия Гагарина в космос $minute\n")

    hour = "10"
    minute = "55"
    println(" время посадки Юрия Гагарина из космоса $hour:$minute")

//    Урок 4
    val length: Long =  40_868_600_000L
    val age: Byte =  27
    val partOfDay: Float = 0.075f
    val seconds: Short =  6480
    val partOfYear: Double =  2.0547945205479453E-4
    val apogee: Int = 327000

    println("Расстояние    $length ")
    println("Возраст       $age ")
    println("Часть  дня    $partOfDay ")
    println("Секунды       $seconds ")
    println("Часть года    $partOfYear ")
    println("Апогей орбиты $apogee ")

//    Урок 5
    1
    var flightInSeconds = (10*60 + 55 - (9*60 + 17))*60
    val flightHours =  flightInSeconds/3600
    flightInSeconds = flightInSeconds - flightHours*3600
    val flightMinutes = flightInSeconds/60
    flightInSeconds = flightInSeconds - flightMinutes*60
    val flightSeconds = flightInSeconds



    println("время полета Гагарина ${"%02d".format(flightHours)}:${"%02d".format(flightMinutes)}:${"%02d".format(flightSeconds)}")

}