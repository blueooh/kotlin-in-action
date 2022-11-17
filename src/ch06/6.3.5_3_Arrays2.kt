package ch06.ex3_5_3_Arrays2

// 컬렉션을 vararg 메소드에 넘기기

fun main(args: Array<String>) {
    val strings = listOf("a", "b", "c")
    // 배열로 변환
    println("%s/%s/%s".format(*strings.toTypedArray()))
}
