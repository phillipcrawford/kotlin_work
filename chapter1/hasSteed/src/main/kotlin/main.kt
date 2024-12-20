const val HERO_NAME = "Madrigal"

fun main() {
    println("Hero announces her presence to the world.")
    println(HERO_NAME)
    var playerLevel: Int = 4
    println(playerLevel)
    var hasSteed = false
    var pub = "Unicorn's Head"
    var publican = "Joe"
    var gold = 50
    var drinks = mutableSetOf("Mead", "Wine", "LaCroix")
    println("The hero gets a sword")
    playerLevel++
    println(playerLevel)
    println(HERO_NAME.reversed())
}