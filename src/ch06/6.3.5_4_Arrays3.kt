package ch06.ex3_5_4_Arrays3

// 원시타입의 배열

fun main(args: Array<String>) {
    val fiveZeros = intArrayOf(0, 0, 0, 0, 0)
    println(fiveZeros[0])

    val l: Long? = null

    // 람다를 인자로 받는 생성자 방법
    val squares = IntArray(5) { i -> (i+1) * (i+1) }
    println(squares.joinToString())
}
