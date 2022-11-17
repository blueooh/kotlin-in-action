package ch08.ex2_3_1_InliningCollectionOperations

/**
 * 8.2.3 컬렉션 연산 인라이닝
 * - 코틀린 표준 라이브러리의 컬렉션 함수는 대부분 람다를 인자로 받음
 */
data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun main(args: Array<String>) {
    // filter 함수의 바이트코드는 그 함수에 전달된 람다 본문의 바이트코드와 함께 Inlining 됨
    println(people.filter { it.age < 30 })
}
