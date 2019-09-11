package collections

fun main(args: Array<String>) {
    val heroesToLevels = mapOf(Pair("Juggernaut", 24), Pair("Mars", 42))
    val namesToAges2 = mapOf(
            "Juggernaut" to 24,
            "Mars" to 42
    )

    println(heroesToLevels == namesToAges2)

    println(heroesToLevels.keys)
    println(heroesToLevels.values)
    println(heroesToLevels.entries)

    val heroesToAttribute = mutableMapOf(
            "Juggernaut" to "agility",
            "Mars" to "strength"
    )

    heroesToAttribute.put("Skywrath", "intelligence")
    heroesToAttribute.putIfAbsent("Brewmaster", "strength")

    println(heroesToAttribute)

    println(heroesToAttribute.contains("Mars"))
    println(heroesToAttribute.contains("Ember"))
    println(heroesToAttribute.containsValue("strength"))

    println(heroesToAttribute.get("Mars"))
    println(heroesToAttribute.getOrDefault("Abadon", "----"))

    heroesToAttribute.forEach {
        println("${it.key} is ${it.value}")
    }
}