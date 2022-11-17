package ch09.ex1_1_1_GenericFunctionsAndProperties

fun main(args: Array<String>) {
    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2)) // 명시적 타입 인자 지정(Char)
    println(letters.slice(10..13)) // 명시적으로 지정하지 않아도 컴파일러가 추론

    genericHighLevelMethod()
}

val authors = listOf("Dmitry", "Svetlana")
val readers = mutableListOf<String>("Dmitry", "Svetlana")
fun<T> List<T>.customFilter(predicate: (T) -> Boolean) : List<T> { return this.filter(predicate) }

fun genericHighLevelMethod() {
    println(readers.customFilter { it !in authors })
}
