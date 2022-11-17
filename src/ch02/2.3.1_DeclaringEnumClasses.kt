package ch02.ex3_1_DeclaringEnumClasses

// enum 클래스안에 프로퍼티나 메소드 정의
enum class Color(
        val r: Int, val g: Int, val b: Int //상수의 프로퍼티 정의
) {
    RED(255, 0, 0), ORANGE(255, 165, 0), // 상수 생성할 때 그에 대한 프로퍼티 값 지정
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main(args: Array<String>) {
    println(Color.BLUE.rgb())
}
