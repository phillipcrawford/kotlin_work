const val HERO_NAME = "Madrigal"

fun main() {
    println("Hero announces her presence to the world.")
    println(HERO_NAME)
    var playerLevel: Int = 4

    println(playerLevel)
    println("The hero gets a sword")
    playerLevel++
    println(playerLevel)

    val race = "gnome"
    val faction = when (race) {
        "dwarf" -> "Keepers of the Mines"
        "gnome" -> "Tinkerers of the Underground"
        "orc", "human" -> "Free people of the Rolling Hills"
        else -> "Shadow Cabal of the Unseen Realm" // Unknown race
    }

    println(faction)
}