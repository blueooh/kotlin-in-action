package ch05.ex1_3_1_SyntaxForLambdaExpressions

/*
   ----파라미터----    -본문-
 { x: Int, y: Int -> x + y }
  -     중괄호 사이에 위치함    -
 */

fun main(args: Array<String>) {
    val sum = { x: Int, y: Int -> x + y }
    val ten = 10
    val noParams =
    {
        val a = 10
        val b = 20
        println(b - a - ten)
    }

    println(sum(1, 2))
    println(noParams())
}
