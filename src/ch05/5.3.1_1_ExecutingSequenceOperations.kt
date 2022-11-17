package ch05.ex3_1_1_ExecutingSequenceOperations

import SequenceTest
import java.util.*

fun main(args: Array<String>) {
    listOf(1, 2, 3, 4).asSequence()
            .map { print("map($it) "); it * it }
            .filter { print("filter($it) "); it % 2 == 0 }

    val words = "The quick brown fox jumps over the lazy dog".split(" ")
    val lengthsList = words.filter { println("filter: $it"); it.length > 3 }
        .map { println("length: ${it.length}"); it.length }
        .take(4)
    println("Lengths of first 4 words longer than 3 chars:")
    println(lengthsList)

    // output:
    // filter: The
    // filter: quick
    // filter: brown
    // filter: fox
    // filter: jumps
    // filter: over
    // filter: the
    // filter: lazy
    // filter: dog
    // length: 5
    // length: 5
    // length: 5
    // length: 4
    // length: 4
    // Lengths of first 4 words longer than 3 chars:
    // [5, 5, 5, 4]

    val words2 = "The quick brown fox jumps over the lazy dog".split(" ").asSequence()
    val lengthsList2 = words2.filter { println("filter: $it"); it.length > 3 }
        .map { println("length: ${it.length}"); it.length }
        .take(4)
    println("Lengths of first 4 words longer than 3 chars:")
    println(lengthsList2)

    // output:
    // Lengths of first 4 words longer than 3 chars
    // filter: The
    // filter: quick
    // length: 5
    // filter: brown
    // length: 5
    // filter: fox
    // filter: jumps
    // length: 5
    // filter: over
    // length: 4
    // [5, 5, 5, 4]
}