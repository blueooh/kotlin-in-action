package ch03.ex4_2_Varargs

// 컬렉션 처리: 가변 길이 인자

// 파라미터를 넣어 실행해보자
fun main(args: Array<String>) {
    // Kotlin -> listOf(vararg elements: T)
    // Java -> listOf(E... elements)
    val list = listOf("args: ", *args) //스프레드 연산자가 배열의 내용을 펼쳐준다
    println(list)
}
// 스프레드 연산자를 통하면 배열에 값과 다른 값을 함께 써서 호출할 수 있음, 자바는 사용할 수 없음