package com.daydream.vhspracticalcoding.a_bootcamp.c_functions

// TODO schreibe eine Klasse Calculator mit der Fuhktion `sum` (addieren) und subtract (subtrahieren)
// TODO die Funktionen sollen immer jeweils auf das vorherige Ergebnis angewendet werden
// TODO schreibe eine Funktion die das derzeitige Ergebnis auf 0 zurücksetzt
// TODO schreibe eine Funktion die einen String zurück gibt, der das Ergebnis darstellt

class SolutionStatefulCalculator(
    private var result: Int = 0
) {

    fun sum(number: Int) {
        result = result + number
    }

    fun subtract(number: Int) {
        result = result - number
    }

    fun reset() {
        result = 0
    }

    fun getResult(): String {
        return "Das Ergebnis ist $result"
    }

}

fun main() {

    val calculator = SolutionStatefulCalculator()

    val result = calculator.getResult()
    println(result)

    calculator.sum(2)
    println(calculator.getResult())

    calculator.subtract(1)
    println(calculator.getResult())

    calculator.reset()
    println(calculator.getResult())

}