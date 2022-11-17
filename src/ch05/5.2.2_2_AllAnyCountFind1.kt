package ch05.ex2_2_2_AllAnyCountFind1

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)

    // 리스트의 원소중 적어도 하나는 3이 아닌 경우
    // case 1
    println(!list.all { it == 3 })

    // case 2
    println(list.any { it != 3 })

    // 원소의 개수 세기
    // case 1
    println(list.count { it > 0 })

    // case 2
    println(list.filter{ it > 0 }.size)
}
