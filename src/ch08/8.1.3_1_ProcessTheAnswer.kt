@file:JvmName("ProcessTheAnswer")

package ch08.ProcessTheAnswer

/**
 * 8.1.3 자바에서 코틀린 함수 타입 사용
 * - 컴파일된 코드 안에서 함수 타입은 일반 인터페이스로 변경
 * - 함수 타입의 변수는 FunctionN 인터페이스를 구현하는 객체를 저장
 * - 코틀린 표준 라이브러리는 함수 인자의 개수에 따라
 *   Function0<R>(인자가 없는 함수), Function1<P1, R>(인자가 하나인 함수) 등의 인터페이스를 제공
 */
/* Kotlin declaration */
fun processTheAnswer(f: (Int) -> Int) { // 파라메터를 함수 타입으로 선언
    println(f(42))
}

/* 자바에서의 호출
>>> processTheAnswer(number -> number + 1)
 */
