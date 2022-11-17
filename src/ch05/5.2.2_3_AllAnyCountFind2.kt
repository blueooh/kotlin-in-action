package ch05.ex2_2_3_AllAnyCountFind2

data class Person(val name: String, val age: Int)

val canBeInClub27 = { p: Person -> p.age <= 27 }
val canBeInClub30 = { p: Person -> p.age == 30 }

// 확장 메서드
fun <T> Collection<T>.findOrNull(predicate: (T) -> Boolean):T? { return find(predicate) }

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.find(canBeInClub27))
    println(people.firstOrNull(canBeInClub27))

    println(people.find(canBeInClub30))
    println(people.firstOrNull(canBeInClub30))
}
