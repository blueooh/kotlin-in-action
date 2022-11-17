package ch06.ex1_4_1_ElvisOperator

// 6.1.4 엘비스 연산자: ?:

// 안전한 호출과 널일 경우 대비값을 지정
fun strLenSafe(s: String?): Int = s?.length ?: 0

fun main(args: Array<String>) {
    println(strLenSafe("abc"))
    println(strLenSafe(null))
}
