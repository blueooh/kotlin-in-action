package ch09.ex2_1_2_GenericsAtRuntimeTypeChecksAndCasts1

// 컴파일 시점에 타입이 명확 하므로 is 를 통한 타입검사가 가능하다
fun printSum(c: Collection<Int>) {
    if (c is List<Int>) {
        println(c.sum())
    }
}

fun main(args: Array<String>) {
    printSum(listOf(1, 2, 3))
}
