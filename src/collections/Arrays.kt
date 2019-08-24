package collections

import util.*

fun main(args: Array<String>) {
    val heroes = arrayOf("swordsman", "archer", "magician")

    val damage = arrayOf<Int>(50, 100, 150)

    val attribute = arrayOfNulls<String>(4)
    attribute[0] = "fire"
    attribute[1] = "water"
    attribute[2] = "wind"
    attribute[3] = "earth"

    val weapon: Array<String> = arrayOf("sword", "bow", "staff")

    val gibberish = arrayOf("1", 1, 5.0)

    val gold = intArrayOf(33, 57, 120)

    val antiHeroes = arrayOf("rogue", "warlock", "undead")

    val allHeroes = heroes + antiHeroes // join arrays

    val allHeroesEmpty: Boolean = allHeroes.isEmpty()

    val hasSwordsman = allHeroes.contains("swordsman")

    val magic = listOf("firebolt", "bash", "heal")

    println(heroes)
    println(damage)
    println(attribute)
    println(weapon)
    println(gibberish)
    // printAll(gold) - will not work because IntArray does not translate to Array<?>
    println(gold)
    printAll(allHeroes)
    printlnThis("size of all heroes: " + allHeroes.size)
    printlnThis("is allHeroesEmpty: " + allHeroesEmpty)

    if (hasSwordsman) {
        printlnThis("allHeroes has swordsman")
    } else {
        printlnThis("allHeroes does not have swordsman")
    }

    printAllList(magic)

}