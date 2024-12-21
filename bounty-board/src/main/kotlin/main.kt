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

    val hasBefriendedBarbarians = true
    val hasAngeredBarbarians = false
    val playerClass = "paladin"
    obtainQuest(playerLevel, hasAngeredBarbarians, hasBefriendedBarbarians, playerClass)
}

private fun obtainQuest(
    playerLevel: Int,
    hasAngeredBarbarians: Boolean,
    hasBefriendedBarbarians: Boolean,
    playerClass: String
) {
    val quest: String = when (playerLevel) {
        1 -> "Meet Mr. Bubbles in the land of soft things."
        in 2..5 -> {
            val canTalkToBarbarians = !hasAngeredBarbarians &&
                    (hasBefriendedBarbarians || playerClass == "barbarian")
            if (canTalkToBarbarians) {
                "Convince the barbarians to call off their invasion."
            } else {
                "Save the town from the barbarian invasions."
            }
        }

        6 -> "Locate the enchanted sword."
        7 -> "Recover the long-lost artifact of creation."
        8 -> "Defeat Nogartse, bring of death and eater of worlds."
        else -> "There are no quests right now."
    }
}