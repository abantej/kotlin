package util

fun <T> printAll(args: Array<T>) {
    for (arg in args) {
        println(arg)
    }
    println("---")
}

fun printAllIntArray(args: IntArray) {
    for (arg in args) {
        println(arg)
    }
    println("---")
}

fun <T> printAllList(args: List<T>) {
    for (arg in args) {
        println(arg)
    }
    println("---")
}

fun printlnThis(arg: Any?) {
    println(arg)
    println("---")
}