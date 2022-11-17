package ch09.printFirst

import java.util.*

// MutableList<*> 는 MutableList<Any?>와 같지 않다
// MutableList<Any?> 는 모든 타입의 원소를 담을 수 있다
// MutableList<*> 는 어떤 정해진 구체적인 타입의 원소만을 담는 리스트 이지만, 그 원소의 타입을 정확히 모른다는 표현 이다

fun main(args: Array<String>) {
    val list: MutableList<Any?> = mutableListOf('a', 1, "abc")
    val chars = mutableListOf('a', 'b', 'c')
    val unknownElements: MutableList<*> = if (Random().nextBoolean()) list else chars
//    unknownElements.add(100) // compile error
    println(unknownElements.first())
}

// List<Any?>
// 위의 코드에서는 MutableList<*>는 MutableList<out Any?> 처럼 동작 한다.
// 어떤 리스트의 원소 타입을 모르더라도, 그 리스트에서 안전하게 Any? 타입을 꺼내는 것은 가능 하지만,
// 타입을 모르는 리스트에 원소를 마음대로 넣을 수는 없다.
// Kotlin List<*> == Java List<?>