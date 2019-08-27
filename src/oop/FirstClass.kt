package oop

class Hero(val name: String, var level: Int) {

    /*val name: String
    val level: Int*/

    init {
        /*this.name = name
        this.level = level*/
        println("hero was created")
    }

    fun attack() {
        println("Attacking...")
    }

    fun castSkill(skill: String) {
        println("casting skill: $skill")
    }

    fun getTotalHP(): Int {
        return 10000
    }

    fun getRemainingHP() = getTotalHP() - 200;
}

class Spell(val name: String, val element: String, val damage: Int, val autocast: Boolean) {
    fun castSpell() {
        if (autocast) {
            println("Auto casting...")
        } else {
            println("Non-auto casting...")
        }
        println("$name / $element / $damage")
    }
}

fun main(args: Array<String>) {
    val hero = Hero("juggernaut", 19)
    println(hero.name)
    println(hero.level)

    //hero.name = "magician"
    println(hero.name)
    hero.attack()
    hero.castSkill("two-hand quicken...")
    println(hero.getTotalHP())
    println(hero.getRemainingHP())

    val spell = Spell("Firebolt", "Fire", 250, true)
    spell.castSpell()
}