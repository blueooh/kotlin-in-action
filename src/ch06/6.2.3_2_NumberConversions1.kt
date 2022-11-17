package ch06.ex2_3_2_NumberConversions1

fun foo(l: Long) = println(l)

fun main(args: Array<String>) {
    // 상수값은 적절한 타입으로 해석된다.
    val b: Byte = 1
    // +는 Byte와 Long을 인자로 받을 수 있다.
    val l = b + 1L

    // 42를 Long값으로 해석(자바에서는 에러)
    foo(42)
}
