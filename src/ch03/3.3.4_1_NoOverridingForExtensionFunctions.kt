package ch03.ex3_4_1_NoOverridingForExtensionFunctions

// Buttion이 상위클래스의 click 함수를 오버라이드 하는 경우
open class View {
    open fun click() = println("View clicked")
}

class Button: View() {
    override fun click() = println("Button clicked")
}

fun main(args: Array<String>) {
    val view: View = Button()
    // Button이 오버라이드한 click이 호출
    view.click()
}
