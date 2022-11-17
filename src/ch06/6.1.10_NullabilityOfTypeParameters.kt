package ch06.ex1_10_NullabilityOfTypeParameters

// 6.1.10 타입 파라미터의 널 가능성

// 타입 파라미터는 기본적으로 널이 될 수 있다.
fun <T> printHashCode(t: T) {
    // 안전한 호출을 써야한다.
    println(t?.hashCode())
}

// 타입 파라미터에 널이 될 수 없는 상한 선언
fun <T: Any> printHashCodeNotNull(t: T) {
    // 안전한 호출을 써야한다.
    println(t.hashCode())
}

fun main(args: Array<String>) {
    // T의 타입은 Any?로 추론( <T: Any> )
    printHashCode(null)

    printHashCodeNotNull(1)
}
