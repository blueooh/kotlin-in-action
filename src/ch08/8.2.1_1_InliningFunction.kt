package ch08.ex2_1_1_InliningFunction

/**
 * 8.2 인라인 함수: 람다의 부가 비용 없애기
 * - inline 변경자를 어떤 함수에 붙이면 컴파일러는 그 함수를 호출하는 모든 문장을
 *   함수 본문에 해당하는 바이트코드로 바꿔치기 해준다.
 */
fun simpleFunc() {
    println("Simple Function!")
}

inline fun inlineFunc() {
    println("Inlining Function!!")
}

fun main() {
    // 결과는 컴파일된 내용을 참조
    simpleFunc()
    inlineFunc()
}