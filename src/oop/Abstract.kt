package oop

abstract class RangedHero(open val name: String, open val level: Int) {
    fun attack() {
        println("$name is attacking!")
    }

    abstract fun defend()
}

class Archer(override val name: String, override val level: Int): RangedHero(name, level) {
    override fun defend() {
        println("$name is attacking with bow")
    }

}

fun main(args: Array<String>) {
    val archer = Archer("Hunter", 40)
    archer.attack()
    archer.defend()
}