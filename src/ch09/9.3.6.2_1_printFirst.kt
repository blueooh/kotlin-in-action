package ch09.printFirst

// 읽기 동작만 수행할때에, 타입 인자 정보가 중요하지 않을때에 아래와 같이 사용 가능하다.

fun printFirst(list: List<*>) {
    if (list.isNotEmpty()) {
        println(list.first()) // first 는 Any? 를 반환하지만, 여기서는 해당 타입만으로도 충분하다
    }
}

fun main(args: Array<String>) {
    printFirst(listOf("Svetlana", "Dmitry"))
}
