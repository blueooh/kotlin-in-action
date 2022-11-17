package ch09.ex3_1_WhyVarianceExists

// 반공변성 : 반공변성 클래스의 하위 타입 관계는 공변 클래스의 경우와 반대이다.

interface Comparator<in T> {
    fun compare(e1: T, e2: T) : Int { // T 를 in 위치에 사용한다
        return 0
    }
}

val anyComparator = Comparator<Any> {
    e1, e2 -> e1.hashCode() - e2.hashCode()
}

val strings : List<String> = listOf("b", "a", "d", "c")

fun sortedWith() {
    println(strings)
    println(strings.sortedWith(anyComparator))
}

fun main() {
    sortedWith()
}