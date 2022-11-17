package ch06.ex1_11_1_2_PlatformTypes1

// 널 가능성과 자바

// 자바의 @Nullabe String은 코틀린에서 String?
// 자바의 @NotNull String은 코틀린에서 String

// 자바 클래스
import ch06.Person

fun yellAtSafe(person: Person) {
    // null 안정성 검사를 수행해도 경고가 뜨지 않는다.
    println((person.name ?: "Anyone").uppercase() + "!!!")

    // null 검사없이 프로퍼티 접근
    println(person.name.uppercase() + "!!!")
}

fun main(args: Array<String>) {
    yellAtSafe(Person(null))
}
