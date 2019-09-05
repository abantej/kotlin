package oop

object Mars {
    val attribute = "Strength"

    fun getAbilities(): String {
        return "God's Rebuke"
    }
}

fun main(args: Array<String>) {
    println(Mars.attribute)
    println(Mars.getAbilities())
}