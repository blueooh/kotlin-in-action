package ch05.ex3_2_2_CreatingSequences1

import java.io.File

fun main(args: Array<String>) {
    performanceTest()
}

fun performanceTest() {
    val naturalNumbers = generateSequence(0) { it + 1 }
    val limits = 10000000
    val numbers = naturalNumbers.takeWhile { it <= limits }

    val loopCount = 100
    var start = 0L

    start = System.currentTimeMillis()
    for(i in 1..loopCount) {
        numbers.map { it + 1 }
            .filter { it % 2 == 0 }
            .map { it + 1 }
            .filter { it % 2 == 0 }
            .toList()
    }
    println("non sequence : ${System.currentTimeMillis() - start}ms")

    start = System.currentTimeMillis()
    for(i in 1..loopCount) {
        numbers.asSequence().map { it + 1 }
            .filter { it % 2 == 0 }
            .map { it + 1 }
            .filter { it % 2 == 0 }
            .toList()
    }
    println("sequence : ${System.currentTimeMillis() - start}ms")


}