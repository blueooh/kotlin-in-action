package ch04.ex1_2_3_OpenFinalAbstractModifiers

/**
 * 추상 클래스 정의하기
 */
abstract class Animated { // 추상 클래스. 이 클래스의 인스턴스를 만들 수 없음
    // abstract 는 기본적으로 열려있음.
    // 추상함수. 이 함수에는 구현이 없음. 하위 클래스에서는 이 함수를 반드시 오버라이드해야 함
    abstract fun animated()

    // 추상클래스에 속해있더라도 비추상 함수는 기본적으로 final 상태. 오버라이드 허용시 open 명시
    open fun stopAnimating() {}

    // 오픈되지 않은 함수
    fun animateTwice() {}
}

class Button : Animated() {
    override fun animated() {
        println("animated!!")
    }

    override fun stopAnimating() {
        println("stop animating!!")
    }
}