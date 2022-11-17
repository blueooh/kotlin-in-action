package ch03.ex3_4_2_NoOverridingForExtensionFunctions1

// 확장 함수는 오버라이드할 수 없다

open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")

    fun showOff() = println("Not extension fun")
}

// 확장 함수는 클래스 밖에서 선언된다.
fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")

fun main(args: Array<String>) {
    val view: View = Button()
    // 확장함수는 정적으로 결정된다
    view.showOff()

    /** 확장함수와 클래스의 멤버함수 이름과 시그니처가 같다면 멤버함수가 호출된다(우선순위) */
    val button = Button()
    button.showOff()
}