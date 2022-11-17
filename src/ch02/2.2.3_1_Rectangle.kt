package geometry.shapes

// 2.2.3 코틀린 소스코드 구조: 디렉터리와 패키지

//표준 자바 라이브러리 클래스 임포트
import java.util.Random

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}
