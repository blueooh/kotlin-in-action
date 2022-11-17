package ch04.ex2_5_ChangingAccessorVisibility

/**
 * 접근자의 가시성 변경
 * get 이나 set 앞에 가시성 변경자를 추가하여 접근자의 가시성을 변경할 수 있음
 */
class LengthCounter {
    var counter: Int = 0
        // 비공개 세터 설정. 이 클래스 밖에서 이 프로퍼티의 값을 바꿀 수 없음.
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main(args: Array<String>) {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi!")
    println(lengthCounter.counter)
}
