package oop

class Skill(val name: String, val level: Int, val damage: Double) {
    override fun toString(): String {
        return "Skill(name=$name, level=$name, damage=$damage)"
    }
}

data class NormalSkill(val name: String, val level: Int, val damage: Double) {

}

fun main(args: Array<String>) {
    val skill = Skill("bash", 10, 100.50)
    val normalSkill = NormalSkill("bash", 10, 100.50)
    val normalSkill2 = NormalSkill("bash", 10, 100.50)
    val normalSkill3 = normalSkill2.copy(damage = 200.00)

    // decomposition
    val (name, level, damage) = normalSkill
    val set = hashSetOf<NormalSkill>(normalSkill, normalSkill2, normalSkill3)

    println(skill)
    println(normalSkill)
    println(normalSkill.equals(normalSkill2))
    println(normalSkill3)

    println(name)
    println(set)
}