package ch08.ex3_1_2_ReturnInLambdas1

/**
 * forEach 에 전달된 람다에서 return 사용하기
 */
data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun lookForAlice(people: List<Person>) {
    // 람다 안에서 return 을 사용하면 람다로부터만 반환되는 것이 아닌, 람다를 호출한 함수가 실행을 끝내고 반환
    // 일반 루프와 동일
    // 자신을 둘러싸고 있는 블럭보다 더 바깥에 있는 다른 블록을 반환하게 만드는 return 문을 non-local return 이라 부른다
    people.forEach {
        if (it.name == "Alice") {
            println("Found!")
            return
        }
    }
    println("Alice is not found")
}

fun main(args: Array<String>) {
    lookForAlice(people)
}
