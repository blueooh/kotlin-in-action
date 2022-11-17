package ch09.ex3_6_2_2_StarProjection1

// 사용 지점 변성과 마찬가지로, 제네릭 파라미터를 통하여 스타 프로젝션을 사용하지 않고 우회 가능하다.

fun <T> printFirst(list: List<T>) {
    if (list.isNotEmpty()) {
        println(list.first()) // first 는 T를 반환한다
    }
}

fun main(args: Array<String>) {
    printFirst(listOf("Svetlana", "Dmitry"))
}

// 스타 프로젝션을 사용하는 쪽이 더 간결 하긴 하지만, 제네릭 타입 파라미터가 어떤 타입인지 굳이 알 필요가 없을 때에만 스타 프로젝션을 사용 한다.