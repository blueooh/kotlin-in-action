package ch08.ex2_3_2_InliningCollectionOperations2

data class Person(val name: String, val age: Int)

val people = listOf(Person("Alice", 29), Person("Bob", 31))

/**
 * - 처리할 원소가 많아지면 중간 리스트를 사용하는 부가 비용도 커짐
 * - asSequence 를 통해 리스트 대신 시퀀스를 사용하면 중간 리스트로 인한 부가 비용은 줄일 수 있음
 * - 시퀀스는 람다를 인라인 하지 않으므로, 크기가 작은 컬렉션은 오히려 일반 컬렉션 연산이 더 성능이 좋을 수 있음
 * - 컬렉션 크기가 큰 경우에만 시퀀스를 통해 성능을 향상 가능
 */
fun main(args: Array<String>) {
    println(people.filter { it.age > 30 }
            .asSequence()
            // 시퀀스는 인라이닝이 되지 않음
            .map(Person::name))
}
