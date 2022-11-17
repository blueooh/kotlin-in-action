package ch06.ex2_3_3_NumberConversions2

// 6.2.4 Any, Any?: 최상위 타입

// 코틀린에서는 Any가 Int등의 원시 타입을 포함한 모든 타입의 조상이다.
// 자바 Object에는 원시타입이 포함되지 않는다.
// 자바 Object -> 코틀린에서는 Any로 취급(Any! 플랫폼 타입)
// 모든 클래스의 toString, equals, hashCode -> Any 메소드 상속

fun main(args: Array<String>) {
    // Any가 참조 타입이기 때문에 42가 박싱된다.
    val answer: Any = 42
}
