package ch04.ex4_1_2_ObjectDeclarations1

data class Person(val name: String) {
    // 중첩 객체를 사용해 Comparator 구현
    object NameComparator : Comparator<Person> {
        override fun compare(p1: Person, p2: Person): Int =
            p1.name.compareTo(p2.name)
    }
}

fun main(args: Array<String>) {
    val persons = listOf(Person("Bob"), Person("Alice"))
    println(persons.sortedWith(Person.NameComparator)) // 중첩객체 호출
}
