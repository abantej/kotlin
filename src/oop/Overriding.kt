package oop

abstract class Quest(val title: String, val reward: Double) {
    open fun embark() {
        println("Embarking quest...")
    }
}

interface Embarkable {
    fun embark() {
        println("Embarkable quest...")
    }
}

open class SlayDragonQuest() : Quest("Slay Dragon", 500.80), Embarkable {
    // overriden functions are open by default
    override final fun embark() {
        super<Embarkable>.embark()
        println("Embarking on a Dragon Slaying quest...")
    }
}

class HarderSlayDragoQuest() : SlayDragonQuest() {
//    will not compile because inherited method is final
//    override fun embark() {
//        println("Embarking on a Harder Dragon Slaying quest...")
//    }
}

fun main(args: Array<String>) {
    val quest = SlayDragonQuest()
    quest.embark()
}