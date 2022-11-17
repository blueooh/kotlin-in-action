package ch06.ex1_7_TheLetFunction

// 6.1.7 let 함수

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

fun main(args: Array<String>) {
    var email: String? = "yole@example.com"
    // it은 람다 구문안에서 널이 아니다.
    // 널이될수 없는 타입의 파라미터가 있는 함수를 호출 할 수 있다.
    email?.let { sendEmailTo(it) }
    email = null
    // null이면 아무일도 일어나지 않는다.
    email?.let { sendEmailTo(it) }
}
