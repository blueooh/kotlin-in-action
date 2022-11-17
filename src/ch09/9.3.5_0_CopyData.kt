package ch09.CopyDataAny

// 사용자 지점 변성
// 타입이 언급되는 지점에서 변성 지정
// 클래스 안에서 어떤 타입 파라미터가 공변, 반공변적인지 선언할 수 없는 경우에도 특정 타입 파라미터가 나타나는 지점에서 변성을 정할 수 있다.

// 선언 지점 변성
// 타입 파라미터가 있는 타입을 사용할 때마다, 해당 타입 파라미터를 상위/하위 타입 중 어떤 타입으로 대치할 수 있는지 명시해야 한다.

fun <T> copyData(source: MutableList<T>, destination: MutableList<T>) {
    for (item in source) {
        destination.add(item)
    }
}

fun main(args: Array<String>) {
    val sourceInts = mutableListOf(1, 2, 3)
    val destInts = mutableListOf(4, 5, 6)
    copyData(sourceInts, destInts)
    println(destInts)
}
