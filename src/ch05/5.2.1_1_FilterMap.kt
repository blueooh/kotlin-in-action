package ch05.ex2_1_1_FilterMap

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    val even = { x: Int -> x % 2 == 0 }
    println(list.filter { it % 2 == 0 })
    println(list.filter (even))
    println(list.filter { it % 2 == 1 })
    println(list.filter { it > 2 })
    println(list.filter { it <= 2 })
}
