package oop

open class Swordsman(open val name: String, open val hp: Int, open var level: Int) {

    init {
        println("Hero was created")
    }

    open fun attack() {
        println("$name attacks!")
    }

    fun defend() {
        println("$name defends!")
    }

    fun getHP() = hp
}

class Knight(override val name: String, override val hp: Int, override var level: Int): Swordsman(name, hp, level) {
    override fun attack() {
        println("$name is attacking with skills..")
    }
}

class Paladin(override val name: String, override val hp: Int, override var level: Int): Swordsman(name, hp, level) {

}

fun main(args: Array<String>) {
    val juggernaut = Swordsman("juggernaut", 100, 60)
    juggernaut.attack()
    juggernaut.defend()
    println(juggernaut.getHP())

    val knightRider = Knight("knight rider", 200, 75)
    knightRider.attack()
    knightRider.defend()
    println(knightRider.getHP())

    val holyKnight = Paladin("holyKnight", 300, 99)
    holyKnight.attack()
    holyKnight.defend()
    println(holyKnight.getHP())
}