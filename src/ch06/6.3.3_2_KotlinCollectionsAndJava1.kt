package ch06.ex3_3_2_KotlinCollectionsAndJava1

import ch06.CollectionUtils

// 6.3.3 코틀린 켈렉션과 자바

// 자바 ArrayList, Hashset은 MutableList와 MutableSet 인터페이스를 상속한 것처럼 취급 -> 코틀린에서 MutableListOf로 만듬
// 코틀린에서 읽기전용 컬렉션을 넘겨도 자바에서는 구분하지 않으므로 변경할수도 있다.

// Kotlin
// collections.kt

// 읽기 전용 파라미터 선언
fun printInUppercase(list: List<String>) {
    // 컬렉션을 변경하는 자바 함수를 호출한다.
    println(CollectionUtils.uppercaseAll(list))
    println(list.first())
}

fun main(args: Array<String>) {
    val list = listOf("a", "b", "c")
    printInUppercase(list)
}

// 널이 아닌 원소로 이뤄진 컬렉션을 자바 메소드로 넘겼는데 자바 메소드가 널을 넣을 수도 있다.