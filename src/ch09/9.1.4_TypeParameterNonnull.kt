package ch09.ex1_3_3_TypeParameterConstraints2

// 타입 파라미터를 널이 될 수 없는 타입으로 한정

class Processor<T> {
    fun <T> process(value: T) { // 눈에는 보이지 않지만 T는 아무런 상한이 정해져 있지 않기 때문에 기본적으로 Any?의 서브 타입으로 본다
        value.hashCode() // value 는 nullable 하기 때문에 안전한 호출을 사용해야한다
    }
}

class Processor2<T : Any> {
    fun <T> process2(value: T) {
        value.hashCode() // value 는 Notnull 이기 때문에 바로 호출 가능
    }
}

fun main() {
    // 가능
    val p = Processor<String?>()

    // 컴파일 오류
//    val p2 = Processor2<String?>()
}