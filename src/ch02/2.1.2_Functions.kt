package ch02.ex1_2_Functions

// 함수, 변수
// 함수이름 파라미터목록 반환타입
fun max(a: Int, b: Int): Int {
    // 함수 본문
    // if(제어 구조) 문이 아니라 식이다
    return if (a > b) a else b
}

// 식이 본문인 함수
// 반환타입 생략
fun max2(a: Int, b: Int): Int = if (a > b) a else b

fun main(args: Array<String>) {
    // 타입을 생략 가능하기 위해 자바와 달리 뒤에 선언
    // 변경불가능 변수
    val answer: Int = 42
    // 변경가능 변수
    var name: String = "andy"

    println(max(1, 2))
}
