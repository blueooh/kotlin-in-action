package ch09.CopyDataAny

// 사용자 지점 변성
// 타입이 언급되는 지점에서 변성 지정
// 클래스 안에서 어떤 타입 파라미터가 공변, 반공변적인지 선언할 수 없는 경우에도 특정 타입 파라미터가 나타나는 지점에서 변성을 정할 수 있다.

// 앞의 예제와 달리, 여러가지 다른 리스트 타입에 대해 동작 하도록 메서드 인자의 제네릭 파라미터 변경
fun <T: R, R> copyData(source: MutableList<T>, destination: MutableList<R>) { // T 는 R의 하위 타입
    for (item in source) {
        destination.add(item)
    }
}

fun main(args: Array<String>) {
    val ints = mutableListOf(1, 2, 3)
    val anyItems = mutableListOf<Any>()
    copyData(ints, anyItems)
    println(anyItems)
}
