package day_4_oop.songs

class Song(private val title: String, private val artist: String) {
    fun play() {
        println("Play the song $title by $artist")
    }

    fun stop() {
        println("Stop the song $title")
    }
}

fun main() {
    val songone = Song("Forever Young", "Jay Z")
    val songtwo = Song("Halo", "Beyonce")
    val songthree = Song("Amina", "Sanaa")

    songone.play()
    songtwo.play()
    songthree.play()
}