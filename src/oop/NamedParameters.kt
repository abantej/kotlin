package oop

class Weapon(val name: String = "Weapon", val type: String, val damage: Int) {
    fun info() {
        println("Weapon [name=$name, type=$type, damage=$damage]")
    }
}

fun main(args: Array<String>) {
    val weapon = Weapon(name="Bastardsword", type="Two-handed Sword", damage=350) // properties can be interchanged
    weapon.info()
    val weapon2 = Weapon(type="Sword", damage=500)
}