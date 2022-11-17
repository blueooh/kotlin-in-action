package ch09.ex1_3_2_TypeParameterConstraints1

data class Test(val name: String) : Comparable<Test> {
    override fun compareTo(other: Test): Int {
        return 0
    }
}

fun <T: Comparable<T>> max(first: T, second: T): T { // 비교 가능한(Comparable의 하위 타입) 인자가 와야 한다
    // (first > second) 부분은 first.compareTo(second) > 0 으로 컴파일 된다
    return if (first > second) first else second
}

fun main(args: Array<String>) {
    println(max("kotlin", "java"))
    println(max(100, 120))
    println(max(Test("1"), Test("2")))
}
