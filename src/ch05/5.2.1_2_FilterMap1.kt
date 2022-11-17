package ch05.ex2_1_2_FilterMap1

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))

    // 연장자 구하기
    // case 1
    println(people.filter { it.age == people.maxByOrNull(Person::age)!!.age })

    // case 2
    val maxAge = people.maxByOrNull { it.name }!!.age
    println(people.filter { it.age == maxAge })

    // case 3
    println(people.filter { it.age > 30 })
}
