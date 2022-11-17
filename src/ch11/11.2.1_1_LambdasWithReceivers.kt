package ch11.ex2_1_1_LambdasWithReceivers

fun buildString(builderAction: (StringBuilder) -> Unit): String { // 파라미터로 함수타입 선언
    val sb = StringBuilder()
    builderAction(sb) // 람다 인자로 StringBuilder 인스턴스를 전달
    return sb.toString()
}

fun main(args: Array<String>) {
    val s = buildString {
        it.append("Hello, ") // it 는 StringBuilder 를 가리킨다
        it.append("World!")
    }
    println(s)
}
