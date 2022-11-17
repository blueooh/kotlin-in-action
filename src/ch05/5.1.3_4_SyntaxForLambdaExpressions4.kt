package ch05.ex1_3_4_SyntaxForLambdaExpressions4

fun main(args: Array<String>) {
    // 변수에 assign
    val sum = { x: Int, y: Int ->
        println("Computing the sum of $x and $y...")
        x + y
    }

    var sub = { x: Int, y: Int ->
        println("Computing the sub of $x and $y...")
        x - y
    }

    var combine = { x: Int, y: Int ->
        println("Computing the sub of $x and $y...")
        sum(1, 2) + sub(2, 1)
    }

    println(sum(1, 2))
    println(sub(2, 1))
    println(combine(2, 1))
}
