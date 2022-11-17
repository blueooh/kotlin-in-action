package ch08.ex3_2_2_ReturningFromLambdas1

/**
 * 함수 이름을 return 레이블로 사용하기
 */
data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun lookForAlice(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice") return@forEach // return@forEach 는 람다 식으로부터 반환
    }
    println("Alice might be somewhere")
}

fun main(args: Array<String>) {
    lookForAlice(people)
}
