package loops

fun main(args: Array<String>) {
    val heroes = listOf("swordsman", "archer", "magician", "priest")
    println(reverse(heroes))
    println(reverse2(heroes))
}

fun reverse(list: List<String>): List<String> {
    val result = arrayListOf<String>()
    for (i in 0..list.size - 1) {
        result.add(list.get(list.size - 1 - i))
    }
    return result
}

fun reverse2(list: List<String>): List<String> {
    val result = arrayListOf<String>()
    for (i in list.size - 1 downTo 0) {
        result.add(list.get(i))
    }
    return result
}