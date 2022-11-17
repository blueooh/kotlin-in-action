package ch06.ex1_1_NullableTypes

//6.1.1 널이 될 수 있는 타입

fun strLenSafe(s: String?): Int =
    if (s != null) s.length else 0

    // 널 검사가 없으면 컴파일 오류
    //s.length

fun main(args: Array<String>) {
    val x: String? = null
    println(strLenSafe(x))
    println(strLenSafe("abc"))
}
