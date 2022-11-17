
data class Person(val name: String, val age: Int)

fun Person.isAdult() = age > 20 // 클래스의 멤버가 아니고 확장 함수 이다.
fun Person.isAdult2() : Boolean { return age > 20 } // 클래스의 멤버가 아니고 확장 함수 이다.

fun main(args: Array<String>) {
    val predicate = Person::isAdult
    var person = Person("Alice", 29)
    println("is ${person.name} adult? ${predicate(person)}")
    // 바운드 멤버 참조
    var isAdult = person::isAdult
    println("is ${person.name} adult? ${isAdult()}")

    person = Person("foo", 5)
    println("is ${person.name} adult? ${predicate(person)}")
    // 바운드 멤버 참조
    isAdult = person::isAdult
    println("is ${person.name} adult? ${isAdult()}")
}
