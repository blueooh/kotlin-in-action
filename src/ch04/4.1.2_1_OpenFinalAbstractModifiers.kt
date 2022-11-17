package ch04.ex1_2_1_OpenFinalAbstractModifiers

/**
 * open, final, abstract 변경자: 기본적으로 final
 * - 자바에서는 final 을 통해 명시적으로 상속을 금지하지 않는 모든 클래스는 다른 클래스가 상속 가능
 * ( 의도와 다른 방식으로 메소드를 오버라이드할 위험이 있음 )
 * - 자바의 클래스와 메소드는 기본적으로 상속에 열려있지만, 코틀린은 기본적으로 final
 */
interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

// 상속을 허용하려면 클래스, 메소드, 프로퍼티 앞에 open 변경자를 붙여야 함
open class RichButton : Clickable { // 열린 클래스. 다른 클래스가 이 클래스를 상속 가능

    fun disable() {} // 이 함수는 파이널. 하위 클래스가 이 메소드를 오버라이드할 수 없음

    open fun animate() {} // 이 함수는 열려있다. 하위 클래스에서 이 메소드를 오버라이드 가능

    override fun click() {} // 오버라이드한 메소드. 오버라이드한 메소드는 기본적으로 열려있음
}

class Button : RichButton() {
    // open 이 아니므로 상속 불가
    // override fun disable() {}

    override fun animate() {
        println("animated!!")
    }

    override fun click() {
        println("click!!")
    }
}

fun main() {
    val button = Button()
    button.animate()
    button.click()
}