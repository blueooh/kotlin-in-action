package ch02.ex3_6_2_IfToWhen1

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

// if 중첩 대신 when 사용하기
fun eval(e: Expr): Int =
    when (e) {
        is Num ->
            e.value // 스마트 캐스트
        is Sum ->
            eval(e.right) + eval(e.left) // 스마트 캐스트
        else ->
            throw IllegalArgumentException("Unknown expression")
    }

fun main(args: Array<String>) {
    println(eval(Sum(Num(1), Num(2))))
}
