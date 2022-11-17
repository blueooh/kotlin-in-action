package ch08.ex1_2_2_CallingFunctionsPassedAsArguments1

fun String.filter(predicate: (Char) -> Boolean): String { // 2. predicate 파라미터로 전달받은 함수를 호출
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) sb.append(element)
    }
    return sb.toString()
}

fun main(args: Array<String>) {
    println("ab1c".filter { it in 'a'..'z' }) // 1. 람다를 predicate 파라미터로 전달
}
