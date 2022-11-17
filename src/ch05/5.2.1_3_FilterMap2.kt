package ch05.ex2_1_3_FilterMap2

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    println(list.map { it * it })
    println(list.map { e -> e * e })
    println(list.map { e : Int -> e * e })
}
