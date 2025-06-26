package com.daydream.vhspracticalcoding.z_handout

fun main() {

    // Klassen

    // Gruppe von Variablen in einer Klasse
    class User(val name: String, val age: Int, val isLoggedIn: Boolean)
    // Ein Objekt der Klasse erstellen, das alle Variablen enthält
    val userAdrian = User(name = "Adrian", age = 37, isLoggedIn = true)

    // Wenn Instanzen der Klassen miteinander verglichen werden sollen == -> data class
    data class UserData(val name: String, val age: Int, val isLoggedIn: Boolean)
    val userAdrianData = UserData(name = "Adrian", age = 37, isLoggedIn = true)
    val userPeterData = UserData(name = "Peter", age = 37, isLoggedIn = true)
    val userAreEqual = userAdrianData == userPeterData // -> false

    // Klasse mit optionaler / nullable Variable
    class UserWithLastName(
        val name: String,
        val lastName: String?,
        val isLoggedIn: Boolean
    )
    // Nachname des Benutzers ist null und kann später aktualisiert werden
    val userPeter = UserWithLastName(name = "Peter", lastName = null, isLoggedIn = true)

    // Klassen können Standardwerte haben
    class UserWithDefaultValue(
        val name: String,
        val lastName: String? = null,
        val isLoggedIn: Boolean
    )
    // Benannte Parameter: Parameter explizit benennen
    // und optional diejenigen mit einem Standardwert überspringen
    val userWithDefaultValue = UserWithDefaultValue(
        name = "Peter",
        isLoggedIn = true
    )
    // Eine Variable einer Klasse aktualisieren
    // userPeter.lastName = "Shepard" // Dies war bereits vorhanden, habe es nur in einen Kommentar umgewandelt
    // Auf die Variablen einer Klasse zugreifen
    if (userPeter.isLoggedIn) {
        // tue etwas, wenn Peter eingeloggt ist
    }

}