package ch08.ex1_4_2_DefaultAndNullValuesForParametersWithFunctionTypes1

/**
 * 8.1.4 널이 될 수 있는 함수 타입 파라미터
 */
fun <T> Collection<T>.joinToString(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = "",
        transform: ((T) -> String)? = null // 널이 될 수 있는 함수 타입의 파라미터 선언
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        val str = transform?.invoke(element) // 안전 호출을 사용하여 함수 호출
                ?: element.toString() // 엘비스 연산자를 사용해 람다를 인자로 받지 않은 경우 처리
        result.append(str)
    }

    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val letters = listOf("Alpha", "Beta")
    println(letters.joinToString())
    println(letters.joinToString { it.lowercase() })
    println(letters.joinToString(separator = "! ", postfix = "! ", transform = { it.uppercase() }))
}
