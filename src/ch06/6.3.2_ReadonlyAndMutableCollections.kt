package ch06.ex3_2_ReadonlyAndMutableCollections

// 6.3.2 읽기 전용과 변경 가능한 컬렉션

// 읽기전용 -> kotlin.collection.Collection
// 변경가능 -> kotlin.collection.MutableCollection

// 읽기 전용 인터페이스를 사용하는 것을 일반적인 규칙으로..
// 읽기 전용 컬렉션이 항상 스레드 안전 하지 않다.

fun <T> copyElements(source: Collection<T>,
                     target: MutableCollection<T>) {
    for (item in source) {
        // 변경 가능한 컬렉션에 원소 추가
        target.add(item)
    }
}

fun main(args: Array<String>) {
    //val source: Collection<Int> = arrayListOf(3, 5, 7)
    val source: Collection<Int> = ArrayList()
    val target: MutableCollection<Int> = arrayListOf(1)
    copyElements(source, target)
    println(target)
}
