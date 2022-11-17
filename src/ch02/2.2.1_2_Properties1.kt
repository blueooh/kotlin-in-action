package ch02.person

// 2.2 클래스와 프로퍼티

// 코드없이 데이터만 저장하는 클레스 -> 값 객체
class Person(
    val name: String,// 비공개 필드, 공개 게터
    var isMarried: Boolean // 비공개 빌드, 공개 게터, 공개 세터
)

fun main(args: Array<String>) {
    val person = Person("Bob", true)
    println(person.name) // 자동으로 게터 호출
    println(person.isMarried)
}
