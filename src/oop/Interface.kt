package oop

interface Levelable {
    val level: Int
}

interface Castable {
    fun castSpell()
}

class Wizard(val name: String): Levelable, Castable {
    override val level: Int = 65
    override fun castSpell() {
        println("$name casting powerful spell!")
    }
}

fun main(args: Array<String>) {
    val wiz = Wizard("Fire Wizard")
    wiz.castSpell()
    println("Wiz level is ${wiz.level}")
}