package ch04.ex4_2_1_CompanionObjects

/**
 * 동반 객체: 팩토리 메소드와 정적 멤버가 들어갈 장소
 * - 코틀린 언어는 자바 static 키워드를 지원하지 않음
 * - 코틀린에서는 패키지 수준의 최상위 함수와 객체 선언을 활용
 */
class A {
    // 중첩 객체 대신 동반 객체를 사용하면 클래스명으로 직접 접근이 가능
    companion object {
        fun bar() {
            println("Companion object called")
        }
    }
}

fun main(args: Array<String>) {
    A.bar()
}
