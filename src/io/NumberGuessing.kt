package io

import java.util.*;

fun main(args: Array<String>) {
    val level = Random().nextInt(100) + 1
    var input: String?
    var guess = -1

    while (guess != level) {
        print("Guess the level of the  hero which is between 1 and 100: ")
        input = readLine()

        if (input != null) {
            // can throw NumberFormatException
            guess = input.toInt()
        }
        if (guess < level) {
            println("Too low")
        } else if (guess > level) {
            println("Too high")
        } else {
            println("You guessed it!")
        }
    }
}