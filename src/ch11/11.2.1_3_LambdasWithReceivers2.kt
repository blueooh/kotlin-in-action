package ch11.ex2_1_3_LambdasWithReceivers2

val appendExcl : StringBuilder.() -> Unit = { this.append("!") } // appendExcl은 확장 함수 타입의 값이다.
val appendExcl2 : StringBuilder.(String,String) -> Unit = { name, name2 ->
    this.append(name)
    this.append(name2)
    this.append("!")
    println(this)
} // appendExcl은 확장 함수 타입의 값이다.

fun main(args: Array<String>) {
    val stringBuilder = StringBuilder("Hi")
    stringBuilder.appendExcl() // appendExcl을 확장 함수처럼 호출할 수 있다.
    println(stringBuilder)
    println(buildString(appendExcl)) // appendExcel을 인자로 넘길 수 있다.

    val stringBuilder2 = StringBuilder("Hello")
    stringBuilder2.appendExcl()
    stringBuilder2.appendExcl2("111", "222")
}

// builderAction을 명시적으로 호출하는 대신 builderAction을 apply 함수에게 인자로 넘긴다. 이렇게 하면 단한줄로 buildString 의 구현이 가능하다.
fun buildString(builderAction: StringBuilder.() -> Unit): String = StringBuilder().apply(builderAction).toString()