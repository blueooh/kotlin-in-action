package ch09.ex3_1_WhyVarianceExists

// Variance, 변성
// List<String>와 List<Any>와 같이 기저 타입이 같고 타입 인자가 다른 여러 타입이 서로 어떤 관계가 있는지 설명하는 개념
fun printContents(list: List<Any>) {
    println(list.joinToString())
    var l = mutableListOf<Number>()
    l.add(Int.MAX_VALUE)
}

fun addAnswer(list: MutableList<Any>) {
    list.add(42)
}

fun main(args: Array<String>) {
    printContents(listOf("abc", "bac")) // String을 Any로 취급 하기 때문에 잘 동작 한다

    val strings = mutableListOf("abc", "bac")
    val ints = mutableListOf(1,2,3,4)
//    addAnswer(strings) // 컴파일 오류, MutableList<Any>가 인자로 선언된 곳에, MutableList<String>을 넘겨줄 수 없다
//    addAnswer(ints) // 컴파일 오류, MutableList<Any>가 인자로 선언된 곳에, MutableList<String>을 넘겨줄 수 없다
//    println(strings.maxBy { it.length }) // 실행 시점에 예외 발생
}

//타입이 일치하지 않습니다.
//필요 항목: MutableList<Any>
//발견된 항목: MutableList<String>

//타입이 일치하지 않습니다.
//필요 항목:
//MutableList<Any>
//발견된 항목:
//MutableList<Int>