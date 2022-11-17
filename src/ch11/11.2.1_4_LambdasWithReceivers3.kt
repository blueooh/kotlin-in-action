package ch11.ex2_1_4_LambdasWithReceivers3

// apply는 수신객체를 묵시적 인자(this)로 받고,
// with는 수신객체를 첫번째 파라미터로 받는다

fun main(args: Array<String>) {
    val map = mutableMapOf(1 to "one")
    map.apply { this[2] = "two" } // 수신 객체 반환(map)
    with(map) { this[3] = "three" } // 람다를 호출해서 얻은 결과 반환(Unit)
    println(map)
}
