package ch09.ex1_1_2_GenericFunctionsAndProperties1

// 확장 프로퍼티만 제네릭하게 생성 가능하다
val <T> List<T>.penultimate: T
    get() = this[size - 2]
val <T> List<T>.endOfList: T
    get() = this.last()

fun main(args: Array<String>) {
    println(listOf(1, 2, 3, 4).penultimate)
    println(listOf(1, 2, 3, 4).endOfList)
}
