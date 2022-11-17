package ch05.ex5_1_2_TheWithFunction1

fun alphabet(): String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) { // 메서드를 호출하려는 수신 객체를 지정한다.
        for (letter in 'A'..'Z') {
            this.append(letter) // "this"를 명시해서 앞에서 지정한 수신 객체의 메서드를 호출한다.
        }
        append("\nNow I know the alphabet!") // "this" 를 생략하고 메서드를 호출한다.
        this.toString() // 람다에서 값을 반환한다.
    }
}

fun main(args: Array<String>) {
    println(alphabet())
}
