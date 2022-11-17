package ch02.ex1_4_3_StringTemplates2

fun main(args: Array<String>) {
    // 중괄호 안에 큰따옴표 사용
    println("Hello, ${if (args.size > 0) args[0] else "someone"}!")
}
