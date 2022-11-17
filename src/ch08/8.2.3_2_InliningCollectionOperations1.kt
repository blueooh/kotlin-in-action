package ch08.ex2_3_2_InliningCollectionOperations1

data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun main(args: Array<String>) {
    // filter 와 map 은 인라인 함수
    // 두 함수의 본문은 인라이닝되며, 추가 객체나 클래스 생성은 없음
    println(people.filter { it.age > 30 }
                  .map(Person::name))
}
