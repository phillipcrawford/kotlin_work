const val HERO_NAME = "Madrigal"
var playerLevel: Int = 5

fun main() {
    println("$HERO_NAME announces her presence to the world.")
    println(playerLevel)

    //println("The hero gets a sword")

    val race = "gnome"
    val faction = when (race) {
        "dwarf" -> "Keepers of the Mines"
        "gnome" -> "Tinkerers of the Underground"
        "orc", "human" -> "Free people of the Rolling Hills"
        else -> "Shadow Cabal of the Unseen Realm" // Unknown race
    }

    println(faction)

//    val hasBefriendedBarbarians = true
//    val hasAngeredBarbarians = false
//    val playerClass = "paladin"
//    //function call
//
//    val quest: String =  obtainQuest(playerLevel, playerClass, hasAngeredBarbarians, hasBefriendedBarbarians)
//    println("The hero approaches the bounty board. It reads:")
//    println(quest)
    readBountyBoard()

    println("Time passes...")
    println("The hero returns from her quest.")

    playerLevel++
    println(playerLevel)
    readBountyBoard()

    val omSymbol: Char = '\u0950'
    print(omSymbol)
}

private fun readBountyBoard() {
    println(
        """
        |  $HERO_NAME approaches the bounty board. It reads:
        |   "${obtainQuest(playerLevel)}"
        """.trimMargin()
    )
}

private fun obtainQuest(
    playerLevel: Int,
    playerClass: String = "paladin",
    hasAngeredBarbarians: Boolean = false,
    hasBefriendedBarbarians: Boolean = true,
): String? = when (playerLevel) {
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
    //else -> "There are no quests right now."
    else -> null
}
//return quest
fun forgeItem(
    quantity: Int = 1,
    itemName: String = "sword",
    material: String,
    jewels: Boolean = false,
    ): String{
        TODO("Implement the strings returned for forgeItem")
}

