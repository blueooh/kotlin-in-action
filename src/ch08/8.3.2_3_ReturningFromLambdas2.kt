package ch08.ex3_2_3_ReturningFromLambdas2

/**
 * 레이블이 붙은 this 식
 */
fun main(args: Array<String>) {
    println(StringBuilder().apply sb@{ // this@sb 를 통해 람다의 묵시적 수신 객체에 접근 가능
       listOf(1, 2, 3).apply {
           this@sb.append(this.toString()) // 바깥쪽 수신 객체에 접근할 경우 레이블을 명시
       }
    })
}
