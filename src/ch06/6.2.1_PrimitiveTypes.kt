package ch06.ex2_1_PrimitiveTypes

// 6.2 코틀린의 원시 타입

// 코틀린은 원시타입과 래퍼타입을 구분하지 않는다.
// 대부분 Int타입은 int타입으로 컴파일된다.
// 자바의 원시타입 -> 코틀린 널이 될 수 없는 타입

fun showProgress(progress: Int) {
    val percent = progress.coerceIn(0, 100)
    println("We're ${percent}% done!")
}

fun main(args: Array<String>) {
    showProgress(146)
}
