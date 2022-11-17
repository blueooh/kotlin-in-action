package ch09.ex1_1_1_GenericFunctionsAndProperties

/*
    class Box<T> -> T : 타입 파라미터
    val a: Box<Int> = Box() -> Int : 타입 인자
 */

fun main(args: Array<String>) {
    val authors = listOf("Dmitry", "Svetlana")

    val readers : MutableList<String> = mutableListOf()
    val readers2 = mutableListOf<String>()
}
