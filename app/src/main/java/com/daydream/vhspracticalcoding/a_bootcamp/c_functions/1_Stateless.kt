package com.daydream.vhspracticalcoding.a_bootcamp.c_functions

// TODO schreibe eine Klasse Calculator mit der Funktion `sum` (addieren) und subtract (subtrahieren)


class SolutionStatelessCalculator {

    fun sum(numberOne: Int, numberTwo: Int): Int {
        val result = numberOne + numberTwo
        return result
    }

    fun subtract(numberOne: Int, numberTwo: Int): Int {
        val result = numberOne - numberTwo
        return result
    }
}

fun main () {

    val calculator = SolutionStatelessCalculator()

    val sum = calculator.sum(1, 2)
    println(sum)

    val subtract = calculator.subtract(1, 2)
    println(subtract)

}