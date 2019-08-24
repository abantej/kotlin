package loops

fun main(args: Array<String>) {
    var heroLevel = 9
    while (heroLevel >= 0) {
        println(heroLevel)
        heroLevel--
    }

    heroLevel = 1
    while (heroLevel <= 10) {
        println(heroLevel)
        heroLevel++
    }
}