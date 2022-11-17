package ch05.ex2_1_5_FilterMap4

fun main(args: Array<String>) {
    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.uppercase() })

    println(numbers.filter { it.key == 0 }.mapValues { it.value.uppercase() })
    println(numbers.filterKeys { it == 0 }.mapValues { it.value.uppercase() })

    println(numbers.mapKeys { it.key + 100 }.mapValues {"hundred " + it.value})
}
