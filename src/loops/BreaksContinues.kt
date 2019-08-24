package loops

fun main(args: Array<String>) {
    for (c in "magician") {
        if (c == 'n') {
            break
        }
        print(c)
    }

    println()

    val heroes = listOf("swordsman", "archer", "magician")
    for (hero in heroes) {
        if (!hero.contains('r')) {
            continue
        }
        println(hero)
    }
}