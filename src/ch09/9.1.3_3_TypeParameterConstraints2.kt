package ch09.ex1_3_3_TypeParameterConstraints2

import java.time.Period

// 타입 파라미터에 대해 둘 이상의 제약을 하는 경우

interface Parent {
    fun parent()
}
interface Child : Parent {
    fun child()
}
class Family : Child {
    override fun parent() {
    }

    override fun child() {
    }
}

fun <T> test(seq: T)
        where T : Child {
            seq.parent()
            seq.child()
        }

fun <T> ensureTrailingPeriod(seq: T)
        where T : CharSequence, T : Appendable { // 타입 파라미터 제약 목록

    if (!seq.endsWith('.')) { // CharSequence
        seq.append('.') // Appendable
    }
}

fun main(args: Array<String>) {
    val f = Family()
    test(f)

    val helloWorld = StringBuilder("Hello World")
    ensureTrailingPeriod(helloWorld)
    println(helloWorld)
}
