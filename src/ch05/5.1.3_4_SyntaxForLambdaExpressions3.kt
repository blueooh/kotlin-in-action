package ch05.ex1_3_4_SyntaxForLambdaExpressions3

data class Person(val name: String, val age: Int)

// 이름 붙인 인자를 사용해 람다 넘기기
fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    var names = people.joinToString(separator = " ", transform = { p: Person -> p.name })
    println(names)

    names = people.joinToString(",", transform = { p: Person -> p.name })
    println(names)

    names = people.joinToString(transform = { p: Person -> p.name }, separator = "-")
    println(names)

    names = people.joinToString("-") { p: Person -> p.name }
    println(names)

//    names = people.joinToString({ p: Person -> p.name }, separator = "&")
//    println(names)
}
