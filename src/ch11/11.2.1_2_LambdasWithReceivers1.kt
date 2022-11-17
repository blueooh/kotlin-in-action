package ch11.ex2_1_2_LambdasWithReceivers1

fun buildString(builderAction: StringBuilder.() -> Unit) : String { // 수신객체가 있는 함수 타입의 파라미터를 선언한다.(확장함수타입)
    val sb = StringBuilder()
    sb.builderAction() // StringBuilder 인스턴스를 람다의 수신 객체로 넘긴다.
    return sb.toString()
}

fun main(args: Array<String>) {
    val s = buildString {
        this.append("Hello, ") // this 키워드는 StringBuilder의 인스턴스를 가리킨다
        append("World!") // this 는 생략 가능
    }
    println(s)
}