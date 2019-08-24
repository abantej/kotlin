package loops

fun main(args: Array<String>) {
    var heroLevel = 0
    for (i in 1..10) {
        heroLevel ++
    }

    println(heroLevel)

    val heroes = listOf("swordsman", "archer", "magician", "priest")
    for (hero in heroes) {
        println(hero)
    }

    for ((i, hero) in heroes.withIndex()) {
        println("Hero at $i is $hero")
    }

    heroLevel = 0
    for (level in 100..100000) {
        heroLevel += level
    }
    println(heroLevel)

    for (hero in heroes) {
        if (hero.contains('a')) {
            println(hero)
        }
    }
}