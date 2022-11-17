package ch04.ex1_1_1_InterfacesInKotlin

/**
 * 1. 코틀린 인터페이스 안에는 추상 메소드뿐 아니라 구현이 있는 메소드도 정의 가능
 * 2. 코틀린에서 클래스는 class 로 정의하지만 인터페이스는 interface 를 사용
 */
interface Clickable {
    fun click()
}

/**
 * 1. 자바에서는 extends 와 implements 키워드를 사용하지만, 코틀린에서는 클래스 이름뒤에 콜론(:)을 사용
 * 2. extends 와 implements 를 구분하지 않고 콜론(:)으로 모두 처리
 */
class Button : Clickable {
    // 자바와 달리 코틀린에서는 override 변경자를 꼭 사용!!
    override fun click() = println("I was clicked")
}

fun main(args: Array<String>) {
    Button().click()
}
