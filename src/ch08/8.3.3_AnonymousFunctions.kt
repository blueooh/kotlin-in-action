package ch08.ex3_3_AnonymousFunctions

/**
 * 8.3.3 무명 함수: 기본적으로 로컬 return
 */
data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun lookForAlice(people: List<Person>) {
    people.forEach(fun(person) { // 람다 식 대신 무명 함수를 사용
        if (person.name == "Alice") return // return 은 가장 가까운 함수를 가르킴
        println("${person.name} is not Alice")
    })

    /*
        무명 함수 안에서 레이블이 붙지 않은 return 식은 무명 함수 자체를 반환시킬 뿐
        무명 함수를 둘러싼 다른 함수를 반환시키지 않는다.
     */

    // filter에 무명 함수 넘기기
    people.filter(fun(person): Boolean {
        return person.age > 30
    })

    // 식이 본문인 무명 함수 사용하기
    people.filter(fun(person) = person.age > 30)
}

fun main(args: Array<String>) {
    lookForAlice(people)
}
