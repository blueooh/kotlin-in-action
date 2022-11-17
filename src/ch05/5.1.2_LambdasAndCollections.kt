package ch05.ex1_2_LambdasAndCollections

data class Person(val name: String, val age: Int)

fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

fun findTheOldest2(people: List<Person>) {
    println(people.maxByOrNull { e -> e.age })
}

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))

    // case 1
    findTheOldest(people)

    // case 2
    println(people.maxByOrNull { e -> e.age })
    println(people.maxByOrNull () { e -> e.age })
    println(people.maxByOrNull { it.age })
    println(people.maxByOrNull(Person::age))

    // case 3
    println(people.maxOf { it.age })
    println(people.maxOfOrNull { it.age })
    println(people.maxOfOrNull { e -> e.age })

    /////////////////////////////////////////////

    people.maxByOrNull { e -> e.age }
    people.maxByOrNull () { e -> e.age } // 함수의 맨 마지막 인자가 람다 라면 () 밖에 람다를 표현할 수 있다.
    people.maxByOrNull { e: Person -> e.age } // 함수의 인자가 하나면서, 람다라면 ()를 생략할 수 있다.
    people.maxByOrNull { e -> e.age } // 타입 추론으로 타입을 제거할 수 있다.
    people.maxByOrNull { it.age } // 파라미터명을 디폴트인 it로 받을 수 있다.
    people.maxByOrNull (Person::age) // 멤버 참조 사용
}

fun lamdaExamples() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))

    println(people.maxByOrNull { e -> e.age })
    println(people.maxByOrNull { it.age })
    println(people.maxByOrNull(Person::age))

    println(people.maxOf { it.age })
    println(people.maxOfOrNull { it.age })
    println(people.maxOfOrNull { e -> e.age })
}
