package ch05.ex3_2_2_CreatingSequences1

import java.io.File

fun File.isInsideHiddenDirectory() =
        generateSequence(this) { it.parentFile }.any { it.isHidden }
fun File.findInsideHiddenDirectory() =
    generateSequence(this) { it.parentFile }. toList()

fun main(args: Array<String>) {
    val file = File("/Users/svtk/.HiddenDir/a.txt")
    println(file.isInsideHiddenDirectory())
    println(file.findInsideHiddenDirectory())
}
