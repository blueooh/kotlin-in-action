package ch02.ex1_4_1_StringTemplates

// 2.1.4 더 쉽게 문자열 형식 지정: 문자열 템플릿

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")
}
