package ch03.JoinToStringFinal

// 이름 붙인 인자

@JvmOverloads // 오버로딩 함수 자동 생성(자바에서 사용할 때)
fun <T> Collection<T>.joinToString(
        /** 디폴트값이 지정된 파라미터들
        오버로딩을 줄일수있다 */
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    // 구조 분해 선언
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    // 자바로 작성한 코드에서는 사용하지 못함
    // jdk6와 호환
    // 앞으로 나올 디폴트 파라미터 값과 함께 사용할때 쓸모가 많음
    println(list.joinToString(separator = "; ",
          prefix = "(", postfix = ")"))

    /** 모든 인자를 쓸 수도 있고, 일부를 생략할 수도 있다 */
    println(list.joinToString())
    println(list.joinToString(";"))

    /** 중간을 생략하고 인자를 지정할수있다 */
    println(list.joinToString(prefix = "(", postfix = ")"))
}
