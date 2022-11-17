package ch04.main

interface Clickable {
    // 일반 메소드 구현
    fun click()

    // 디폴트 구현이 있는 메소드
    // 자바에서는 default 메소드 구현시, 접근자를 명시하지 않아도 됨
    fun showOff() = println("I'm clickable!")
}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

class Button : Clickable, Focusable {
    override fun click() = println("I was clicked")

    // 이름과 시그니처가 같은 멤버 메소드에 둘 이상의 디폴트 구현이 있는 경우
    // 인터페이스를 구현하는 하위 클래스에서 명시적으로 새로운 구현을 제공해야 함
    override fun showOff() {
        // 다이아몬드 표편식을 통해 어떤 상위타입의 멤버 메소드를 호출할지 지정 가능
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main(args: Array<String>) {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}
