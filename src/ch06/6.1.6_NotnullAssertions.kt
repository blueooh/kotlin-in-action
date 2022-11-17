package ch06.ex1_6_NotnullAssertions

// 6.1.6 널 아님 단언: !!

fun ignoreNulls(s: String?) {
    // 널이 될 수 없는 타입으로 바꿈
    // 널일 때 NPE(책 잘못 설명..)
    val sNotNull: String = s!!
    println(sNotNull.length)
}

fun main(args: Array<String>) {
    ignoreNulls(null)
}
