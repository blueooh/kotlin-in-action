package ch04.ex2_3_1_ImplementingPropertiesDeclaredInInterfaces

fun getFacebookName(accountId: Int) = "fb:$accountId"

/**
 * 인터페이스에 선언된 프로퍼티구현
 */
interface User {
    // 코틀린에서는 인터페이스에 추상 프로퍼티 선언을 넣울 수 있음
    // 인터페이스에 있는 프로퍼티 선언에는 뒷받침하는 필드나 게터 등의 정보가 들어있지 않음
    // User 인터페이스를 구현하는 클래스가 nickname 의 값을 얻을 수 있는 방법을 제공해야 함
    val nickname: String
}

// override 를 이용하여 추상 프로퍼티 값을 제공
class PrivateUser(override val nickname: String) : User

class SubscribingUser(val email: String) : User {
    // override 를 이용하여 추상 프로퍼티 값을 제공
    override val nickname: String
        get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User {
    // override 를 이용하여 추상 프로퍼티 값을 제공
    override val nickname = getFacebookName(accountId)
}

fun main(args: Array<String>) {
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)
}
