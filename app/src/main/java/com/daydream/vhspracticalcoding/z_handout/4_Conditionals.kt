package com.daydream.vhspracticalcoding.z_handout

// Boolesche Kombinationen

fun main() {

    val isLoggedIn = true

    val isPremiumUser = true
    // alle Werte müssen wahr sein, damit das Ergebnis wahr ist (false && true = false)
    val userHasAccess = isLoggedIn && isPremiumUser
    // mindestens ein Wert muss wahr sein, damit das Ergebnis wahr ist (false || true = true)
    val userIsLoggedInOrPremium = isLoggedIn || isPremiumUser

    // Bedingungen

    if (isLoggedIn && isPremiumUser) {
        // Premium-Inhalte anzeigen
    } else if (isLoggedIn) { // mehrere else-if-Anweisungen sind möglich
        // nach Premium-Abonnement fragen
    } else {
        // zum Login auffordern
    }
    // Alternative Kotlin-Schreibweise für dasselbe wie oben (when-Anweisung)
    when {
        isLoggedIn && isPremiumUser -> {
            // Premium-Inhalte anzeigen
        }

        isLoggedIn -> {
            // nach Premium-Abonnement fragen
        }

        else -> {
            // zum Login auffordern
        }
    }
}