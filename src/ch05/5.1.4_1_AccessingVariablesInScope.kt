package ch05.ex1_4_1_AccessingVariablesInScope

/**
 * Closure(Close Over)
 * Inner Scope(내부 함수, 람다)에서 Outer Scope(상위 함수의 영역) 의 변수에 접근할 수 있는 것
 */
data class Test(var name: Int)


fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

fun print(responses: Collection<String>, test: Test) {
    val counter = Test(0)

    var client = 0;
    var server = 0;
    responses.forEach {
        if (it.length > 0) {
            ++client
        } else {
            ++server
        }
        counter.name++
        println("$client, $server, ${test.name}")
    }

}

fun main(args: Array<String>) {
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error:")
    println(listOf("test"))
}