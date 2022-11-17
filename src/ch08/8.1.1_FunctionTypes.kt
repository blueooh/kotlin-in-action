package ch08.ex1_1_FunctionTypes

/**
 * 8.1.1 함수 타입
 * - 고차함수 : 다른 함수를 인자로 받거나 함수를 반환하는 함수
 * - filter 는 술어 함수를 인자로 받으므로 고차함수임
 * ㄴ ex) list.filter { x > 0 }
 * - 고차 함수를 정의하려면 함수 타입에 대해 알아야 함.
 */
fun performRequest(
        url: String,
        callback: (code: Int, content: String) -> Unit // 함수타입의 각 파라미터에 이름을 명시할 수 있음
) {
    val sum: (Int, Int) -> Int // 함수 타입. (파라미터 타입) -> 반환 타입으로 구성
    val print: (String) -> Unit // 반환값이 없는 함수 타입
    val supplier: () -> String // 파라미터가 없는 함수 타입
    var canReturnNull: (Int, Int) -> Int? = {x, y -> null} // null 이 될수 있는 반환 타입
    var funOrNull: ((Int, Int) -> Int)? = null // null 이 될 수 있는 함수 타입
}

fun main(args: Array<String>) {
    val url = "http://kotl.in"
    performRequest(url) { code, content -> /*...*/ } // API 에서 제공하는 이름을 람다에 사용할 수 있음
    performRequest(url) { code, page -> /*...*/ } // 파라미터 이름 대신 원하는 다른 이름을 사용해도 무방
}
