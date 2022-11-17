package ch02.ex1_4_2_StringTemplates1

fun main(args: Array<String>) {
    if (args.size > 0) {
        // 한글, 복잡한 식 중괄호 사용
        println("Hello, ${args[0]}!")
    }
}
