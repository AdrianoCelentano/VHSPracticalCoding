package com.daydream.vhspracticalcoding.a_bootcamp.b_classes

// TODO 1.) modeliere ein Musikalbum mit Klassen
// TODO 2.) finde ein weiteres eigenes Beispiel für eine Klasse

data class SolutionAlbum(
    val title: String,
    val artist: String,
    val year: Int,
    val songs: List<SolutionSong>,
    val genre: String = "Pop",
    val label: String? = null,
)

data class SolutionSong(
    val title: String,
    val duration: Int
)