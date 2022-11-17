package ch06.ex2_3_3_NumberConversions2

// 6.2.5 Unit 타입: 코틀린의 void

// 코틀린의 Unit타입은 자바 void와 같은 기능
// void와 달리 Unit을 타입 인자로 쓸 수 있다.
// 전통적으로 함수형 언어에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미, 인스턴스의 유무가 void와 unit을 구분하는 가장 큰 차이

fun f1(): Unit { }
fun f2() { }

interface Processor<T> {
    fun process(): T
}

class NoResultProcessor: Processor<Unit> {
    override fun process() {
        // return을 명시할 필요가 없다.
        // 자바에서는 리턴값이 없는 메소드를 분리하거나 타입을 Void로 넣어도 되지만 return null을 항상 명시해야한다.
    }
}

fun main(args: Array<String>) {
}
