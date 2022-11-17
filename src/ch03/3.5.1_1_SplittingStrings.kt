package ch03.ex5_1_1_SplittingStrings

// 문자열과 정규식 다루기
// toRegex() -> 확장함수
fun main(args: Array<String>) {
    // 정규표현식인지 일반문자열인지 구분이 쉽다
    println("12.345-6.A".split("\\.|-".toRegex()))
}
