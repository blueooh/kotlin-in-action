package ch04.ex1_5_2_SealedClasses1

/**
 * 상위 클래스에 sealed 변경자를 붙이면 그 상위 클래스를 상속한 하위 클래스 정의를 제한할 수 있음
 * sealed 클래스의 하위 클래스를 정의할 때는 반드시 상위 클래스 안에 중첩 시켜야 함
 * sealed 클래스는 자동으로 open
 * 봉인된 클래스는 클래스 외부에 자신을 상속한 클래스를 둘 수 없음
 */
sealed class Expr { // 기반 클래스를 sealed 로 봉인
    // 기반 클래스의 모든 하위 클래스를 중첩 클래스로 나열
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun eval(e: Expr): Int =
    when (e) { // "when" 식이 모든 하위 클래스를 검사하므로 별도의 "else" 분기가 없어도 됨
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
    }

fun main(args: Array<String>) {
    println(eval(Expr.Sum(Expr.Sum(Expr.Num(1), Expr.Num(2)), Expr.Num(4))))
}
