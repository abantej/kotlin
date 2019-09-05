package functions

import java.util.*

fun attackEnemy() {
    println("Attacking the enemy!!!")
}

fun attackEnemy(name: String) {
    println("Attacking enemy hero $name")
}

fun gatherLoots(): String {
    return "Gathering loots!!!"
}

fun getSpawnTime(): Date {
    return Date()
}

object Map {
    fun getPosition(): String {
        return "nowhere"
    }
}

fun main(args: Array<String>) {
    attackEnemy()
    attackEnemy("Axe")
    println(gatherLoots())
    println(getSpawnTime())
}