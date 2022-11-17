package geometry.example

// 이름으로 함수 임포트하기
import geometry.shapes.createRandomRectangle

fun main(args: Array<String>) {
    println(createRandomRectangle().isSquare)
}
