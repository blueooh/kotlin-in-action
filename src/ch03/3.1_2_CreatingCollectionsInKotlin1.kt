package ch03.ex1_2_CreatingCollectionsInKotlin1

// 자바보다 더 많은 기능
// 자바 클래스에는 없는 메소드를 코틀린은 어디에 정의?
/** =확장 함수로 구현되어 있다 */
fun main(args: Array<String>) {
    val strings = listOf("first", "second", "fourteenth")
    println(strings.last()) // last메소드 선언을 확인해보자
    val numbers = setOf(1, 14, 2)
    println(numbers.maxOrNull())
}
