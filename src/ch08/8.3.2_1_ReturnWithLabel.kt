package ch08.ReturnWithLabel

/**
 * 8.3.2 람다로부터 반환: 레이블을 사용한 return
 */
data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun lookForAlice(people: List<Person>) {
    people.forEach label@{ // 람다 식 앞에 레이블을 붙인다.
        if (it.name == "Alice") return@label // return@label은 앞에서 정의한 레이블을 참조
    }
    println("Alice might be somewhere") // 항상 이줄이 출력
}

fun main(args: Array<String>) {
    lookForAlice(people)
}
