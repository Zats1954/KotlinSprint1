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
}