package ch09.ex1_3_1_TypeParameterConstraints

// 타입 파라미터 제약
// 클래스나 함수에 사용할 수 있는 타입 인자(T)를 제한
fun <T : Number> oneHalf(value: T): Double {
    return value.toDouble() / 2.0 // value 는 Number의 하위 타입으로 .toDouble() 호출이 가능 하다
}

fun main(args: Array<String>) {
    println(oneHalf(3))
}
