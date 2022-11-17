package ch05.ex1_5_2_MemberReferences1

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    // 생성자 참조
    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    println(p)

    val createPerson2 = { name: String, age: Int -> Person(name, age) }
    val p2 = createPerson2("foo", 5)
    println(p2)
}
