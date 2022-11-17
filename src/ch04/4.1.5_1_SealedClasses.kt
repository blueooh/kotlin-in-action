package ch04.ex1_5_1_SealedClasses

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        // when 을 사용하여 타입검사할 때 꼭 디폴트 분기인 else 를 명시해야 함
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

/**
 * 봉인된 클래스 : 클래스 계층 정의 시 계층 확장 제한
 */
fun main(args: Array<String>) {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}
