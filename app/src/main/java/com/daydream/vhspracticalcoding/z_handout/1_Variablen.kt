package com.daydream.vhspracticalcoding.z_handout

fun main() {

    // Variablen

    val number: Int = 2 // kleinere Zahlen
    val numberSimple = 2 // Datentyp ist optional, da er automatisch erkannt wird
    val biggerNumber: Long = 2L // größere Zahlen kurz -> var biggerNumber = 2L
    val number3 = 3 // Variable aktualisieren
    val decimal: Double = 2.2 // kann größere Dezimalzahlen darstellen
    val smallerDecimal: Float = 2.2f // kann kleinere Dezimalzahlen darstellen
    val text: String = "hallo" // kurz var text = "hallo"
    val isLoggedIn: Boolean = false // kurz var isLoggedIn = false
    val nullableNumber: Int? = null // kann nicht verkürzt werden, sonst ist der Datentyp nicht klar
    val stringListe: List<String> = listOf("eins", "zwei", "drei") // <String> definiert den Inhalt der Liste
    val intListe = listOf(1, 2, 3) // List<Int> kann auch weggelassen werden, wenn der Typ klar ist

    print(number)
}