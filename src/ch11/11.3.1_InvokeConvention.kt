package ch11.ex3_1_InvokeConvention

// invoke 관례를 사용하면 객체를 함수처럼 호출할 수 있다.
// ex Function1()
// 7장에서 학습한 내용으로, 관례는 특별한 이름이 붙은 함수를 일반 메서드 호출 구문으로 호출하지 않고, 더 간단한 다른 구문으로 호출할 수 있게 지원하는 기능
// operator get을 재정의 하면 a[0] 같은 문법으로 접근가능하듯, invoke 는 () 괄호로 접근 가능하다.
class Greeter(val greeting: String) {
    operator fun invoke(name: String) {
        println("$greeting, $name!")
    }
}

fun main(args: Array<String>) {
    val bavarianGreeter = Greeter("Servus")
    bavarianGreeter("Dmitry") // 객체(인스턴스)를 함수처럼 호출
    // bavarianGreeter.invoke("Dmitry") 로 컴파일
}
