package ch05.ex3_2_1_CreatingSequences

fun main(args: Array<String>) {
    val naturalNumbers = generateSequence(0) { it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.toList())
    println("max : ${numbersTo100.maxByOrNull { it }}")
    println("sum : ${numbersTo100.sum()}")
}
