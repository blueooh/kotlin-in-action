package ch06.ex1_9_ExtensionsForNullableTypes

// 6.1.9 널이 될 수 있는 타입 확장

fun verifyUserInput(input: String?) {
    // 안전한 호출을 하지 않아도 된다.
    // 확장함수가 널을 처리해준다.
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}

fun main(args: Array<String>) {
    verifyUserInput(" ")
    verifyUserInput(null)
}
