package com.daydream.vhspracticalcoding.z_handout

fun main() {

    // Operatoren

    var number: Int = 2
    val text: String = "hallo"

    val sum = 1 + 3 // andere Operatoren
    val twoHellos = "hallo" + " " + "hallo" // > "hallo hallo"
    val kotlinStringCombining = "text $text" // "hallo hallo"
    val sumVariable = number + 1 // Beispiel
    number = number + 2 // 2 zu einer bestehenden Variable hinzufügen -> 3 + 2 = 5
    number += 2 // wie oben -> 5 + 2 = 7
    val numberIncrement = number++ // ist dasselbe wie number = number + 1 -> 7 + 1 = 8
    val isEqualOne = 1 == 1 // true
    val isEqualVariable = number == 1 // 8 == 1 -> false
    val isHigher = number > 3 // 8 > 3 -> true
    val isNotEqual = 3 != number // 3 != 8 -> true
    val isBiggerOrEqual = number >= 3 // 8 >= 3 -> true
    val isSmallerOrEqual = 3 <= number // 3 <= 8 -> true

    print(number)
}