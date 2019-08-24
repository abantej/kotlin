package loops

fun main(args: Array<String>) {

    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (i == 5) {
                break@outer
            }
            println("$i - $j")
        }
    }
}