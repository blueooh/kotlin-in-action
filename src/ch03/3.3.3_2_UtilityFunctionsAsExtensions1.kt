package ch03.ex3_3_2_UtilityFunctionsAsExtensions1

/** 정적인 유틸리티 클래스 없애기: 최상위 함수와 프로퍼티

코틀린 파일의 최상위 함수는 이 클래스의 정적인 메소드가 된다.

확장 함수 -> 클래스 밖에 선언된 함수
Collection<T> -> 수신 객체 타입, this.withIndex -> this 수신객체
private, protectd 멤버 사용할 수 없음 */
fun <T> Collection<T>.joinToString(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}


fun main(args: Array<String>) {
    val list = arrayListOf(1, 2, 3)
    println(list.joinToString(" "))

    // java에서 StringUtil.kt 파일에 정의했다면 아래와 같이 호출할 수 있다
    // char c = StringUtil.lastChar("Java");
}
