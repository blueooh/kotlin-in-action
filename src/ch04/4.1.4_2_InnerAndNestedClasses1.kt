package ch04.ex1_4_2_InnerAndNestedClasses1

/**
 * 내부 클래스
 */
class Outer {
    fun print() = println("Outer!!")

    // 바깥쪽 클래스에 대한 참조를 포함하게 말들고 싶다면 inner 변경자를 붙여야 함
    // 내부 클래스 Inner 안에서 바깥쪽 클래스 Outer 에 접근하려면 this@Outer 사용
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
        fun exec() = this@Outer.print()
    }
}

fun main() {
    Outer().Inner().exec()
}
