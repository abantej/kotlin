package oop

class DemonSlayer(level: String) {
    val abilities = "Immense physical strength".also(::println)

    init {
        println("First init block...")
    }

    val properties = "Fire property".also(::println)

    init {
        println("Second init block...")
    }
}

fun main(args: Array<String>) {
    val demonSlayer = DemonSlayer("Tomioka")
}