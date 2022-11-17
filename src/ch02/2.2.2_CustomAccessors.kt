package ch02.ex2_2_CustomAccessors

// 2.2.2 커스텀 접근자

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() { // 프로퍼티 게터 선언
            return height == width
        }

    // 가독성, 클래스의 특성을 정의
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(41, 43)
    println(rectangle.isSquare)
}
