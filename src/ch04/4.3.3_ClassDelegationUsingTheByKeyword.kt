package ch04.ex3_3_ClassDelegationUsingTheByKeyword

import java.util.HashSet

/**
 * 클래스 위임 : by 키워드
 * 인터페이스를 구현할 때 by 키워드를 통해 그 인터페이스에 대한 구현을 다른 객체에 위임  중이라는 사실을 명시 할 수 있음.
 */
class CountingSet<T>(
        val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet { // by : MutableCollection 의 구현을 innerSet 에게 위임

    var objectsAdded = 0

    // add, addAll 메소드는 위임하지 않고 새로운 구현을 제공
    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    // add, addAll 메소드는 위임하지 않고 새로운 구현을 제공
    override fun addAll(c: Collection<T>): Boolean {
        objectsAdded += c.size
        return innerSet.addAll(c)
    }
}

fun main(args: Array<String>) {
    val cset = CountingSet<Int>()
    cset.addAll(listOf(1, 1, 2))
    println("${cset.objectsAdded} objects were added, ${cset.size} remain")
}
