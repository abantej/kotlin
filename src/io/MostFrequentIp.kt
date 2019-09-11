package io

import java.io.File

fun main(args: Array<String>) {
    val ipToCount = mutableMapOf<String, Int>()
    File("src/ips.txt").forEachLine {
        val previous = ipToCount.getOrDefault(it, 0)
        ipToCount.put(it, previous + 1)
        // long approach
//        if (ipToCount.contains(it)) {
//            val previous = ipToCount.get(it)!!
//            ipToCount.put(it, previous + 1)
//        } else {
//            ipToCount.put(it, 1)
//        }
    }

    val (maxIp, maxCount) = ipToCount.entries.maxBy {
        it.value
    }!!

    //long approach 1
//    var maxIp = ipToCount.keys.first()
//    var maxCount = 0;
//    for ((ip, count) in ipToCount.entries) {
//        if (count > maxCount) {
//            maxCount = count
//            maxIp = ip
//        }
//    }
    // long approach 2
//    ipToCount.forEach {
//        if (it.value > maxCount) {
//            maxCount = it.value
//            maxIp = it.key
//        }
//    }

    println("The most frequest IP is $maxIp")
}