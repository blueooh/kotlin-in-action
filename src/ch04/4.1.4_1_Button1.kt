package ch04.Button1

import java.io.Serializable


interface State: Serializable

interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

/**
 * 중첩클래스 : 코틀린 중첩 클래스는 명시적으로 요청하지 않는 한 바깥쪽 클래스 인스턴스에 접근 권한이 없음
 */
class Button : View {
    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) { /*...*/ }

    // 코틀린 중첩 클래스에 아무런 변경자가 붙지 않으면 자바 static 중첩 클래스와 동일
    class ButtonState : State {
        fun print() = println("just print")
    }
}

fun main() {
    Button.ButtonState().print()
}
