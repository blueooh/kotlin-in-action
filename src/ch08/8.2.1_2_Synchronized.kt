package ch08.ex2_1_2_Synchronized

import java.util.concurrent.locks.Lock

/**
 * 8.2.1 인라이닝이 작동하는 방식
 *  - synchronized 함수의 본문뿐 아니라 synchronized 에 전달된 람다의 본문도 함께 인라이닝 됨.
 *  - 람다의 본문에 의해 만들어지는 바이트코드는 그 람다를 호출하는 코드 정의의 일부분으로 간주되므로 무명클래스로 감싸지 않음.
 */
inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        println("Synchronized Area.")
        return action()
    } finally {
        lock.unlock()
    }
}

fun foo(lock: Lock) {
    println("Before sync")

    synchronized(lock) {
        println("Lambda Code")
    }

    println("After sync")
}