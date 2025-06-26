package com.daydream.vhspracticalcoding.z_handout

fun main() {

    // Funktionen

    class UserWithFunctions(
        var name: String,
        var lastName: String? = null,
        var isLoggedIn: Boolean
    ) {
        // Funktion zum Aktualisieren einer Variablen einer Klasse
        fun login() {
            isLoggedIn = true
        }

        fun logout() {
            // Optional kann es hilfreich sein, "this." vor die Variable zu schreiben,
            // um anzuzeigen, dass es sich um eine Variable dieser Klasse handelt
            this.isLoggedIn = false
        }

        // Funktionen mit einem Rückgabewert
        fun hasCompleteProfile(): Boolean {
            if (lastName == null) {
                return true
            } else {
                return false
            }
        }

        // Funktion mit einem Parameter
        fun updateLastName(newLastName: String) {
            lastName = newLastName
        }
    }

    val userWithFunctions =
        UserWithFunctions(name = "Peter", isLoggedIn = true) // Nachname ist null
    // Eine Funktion der Klasse aufrufen und das Ergebnis in einer Variable speichern
    val userHasCompleteProfile = userWithFunctions.hasCompleteProfile()
    // Alternativ direkt
    if (userHasCompleteProfile) {
        if (userWithFunctions.hasCompleteProfile()) {
            userWithFunctions.login() // die Login-Funktion aufrufen
        } else {
            // die updateLastName-Funktion aufrufen und einen Parameter übergeben
            userWithFunctions.updateLastName(newLastName = "Shepard")
        }
    }

}