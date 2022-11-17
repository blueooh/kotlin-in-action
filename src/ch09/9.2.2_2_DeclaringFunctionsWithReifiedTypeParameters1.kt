package ch09.ex2_2_2_DeclaringFunctionsWithReifiedTypeParameters1

// 실체화한 타입 파라미터 사용하여 특정 타입으로 제네릭 컬렉션 필터링 하기

fun main(args: Array<String>) {
    val items = listOf("one", 2, "three")
    println(items.filterIsInstance<String>())
}
