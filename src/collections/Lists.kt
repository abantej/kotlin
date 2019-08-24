package collections

fun main(args: Array<String>) {
    val heroes = arrayListOf("swordsman", "archer", "magician", "priest")
    val newHero = arrayListOf("barbarian")
    println(heroes)
    println(heroes + newHero)
    println(heroes.size)
    println(heroes.isEmpty())
    println(heroes.contains("archer"))

    heroes.add("knight")
    println(heroes)
    val removed = heroes.remove("priest")
    println(removed)
    println(heroes)

    val someHeroes = heroes.subList(1, 4)
    println(someHeroes)
}