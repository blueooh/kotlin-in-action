package ch08.LookForAlice

/**
 * 8.3.1 람다 안의 return 문: 람다를 둘러싼 함수로부터 반환
 */
data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun lookForAlice(people: List<Person>) {
    for (person in people) {
        if (person.name == "Alice") {
            println("Found!")
            return
        }
    }
    // 목록에 엘리스가 없으면 출력
    println("Alice is not found")
}

fun main(args: Array<String>) {
    lookForAlice(people)
}
