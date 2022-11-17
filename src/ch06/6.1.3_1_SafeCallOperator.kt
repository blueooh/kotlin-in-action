package ch06.ex1_3_1_SafeCallOperator

//6.1.3 안전한 호출 연산자 :?

fun printAllCaps(s: String?) {
    // 호출하려는 값이 null이면 호출은 무시되고 null이 결과 값
    val allCaps: String? = s?.uppercase()
    println(allCaps)
}

fun main(args: Array<String>) {
    printAllCaps("abc")
    printAllCaps(null)
}
