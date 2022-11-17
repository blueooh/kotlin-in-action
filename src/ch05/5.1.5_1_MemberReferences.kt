package ch05.ex1_5_1_MemberReferences

data class Person(val age: Int, val name: String)

val getAge = { person: Person -> person.age }
val getAge2 = Person::age // 멤버 참조
//            클래스::멤버

fun salute() = println("Salute!")

fun main(args: Array<String>) {
    run(::salute) // 최상위 함수 참조

    var peoples = listOf(
        Person(name = "Alice", age = 29),
        Person(name = "Bob", age = 31)
    )

    val age = peoples.maxByOrNull { it.age }
    println(age)

    // 멤버 참조를 통한 호출
    val age2 = peoples.maxByOrNull(getAge)
    println(age2)

    val age3 = peoples.minByOrNull(getAge2)
    println(age3)
}
