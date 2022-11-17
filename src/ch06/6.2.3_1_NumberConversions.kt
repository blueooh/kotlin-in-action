package ch06.ex2_3_1_NumberConversions

// 6.2.3 숫자 변환

fun main(args: Array<String>) {

    val i = 1
    // 자동 변환 불가능
    // val l: Long = i
    // 변환 메소드를 호출 해야한다.
    // val l: Long = i.toLong()

    val x = 1
    println(x.toLong() in listOf(1L, 2L, 3L))
}
