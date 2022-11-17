package ch03.ex3_5_ExtensionProperties

// 확장 프로퍼티

// 확장 프로퍼티 선언
// 자체 값을 저장하는 장소가 없기때문에 getter를 꼭 정의, 초기화 코드도 쓸수없다.(컴파일 에러)
val String.lastChar: Char
    get() = get(length - 1) // 수신객체의 값을 계산
var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value) // 수신객체의 값을 변경
    }

fun main(args: Array<String>) {
    println("Kotlin".lastChar)
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}
