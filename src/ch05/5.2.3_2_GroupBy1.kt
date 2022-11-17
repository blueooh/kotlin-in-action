package ch05.ex2_3_2_GroupBy1

fun main(args: Array<String>) {
    val list = listOf("a", "ab", "b")
    println(list.groupBy{ it.first() })
    println(list.groupBy(String::first))
    println(list.groupBy(String::last).mapKeys { it.key + "" + it.key.code} )
}
