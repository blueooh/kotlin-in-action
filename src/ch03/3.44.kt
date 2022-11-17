package ch03

/** 이펙티브 코틀린 아이템 44 - 멤버 확장 함수의 사용을 피해라 */

class PhoneBookIncoreect {
    fun String.isPhoneNumber() = length == 7 && all { it.isDigit() }
}

fun main() {
    //1. 가시성 제한하지 못함
    //2. 확장함수 사용이 어려움
    PhoneBookIncoreect().apply { println("1234567890".isPhoneNumber()) }

    //3. 레퍼런스 지원하지 않음 (컴파일 에러)
    //val ref = PhoneBookIncoreect::isPhoneNumber
    //val book = PhoneBookIncoreect()
    //val bookRef = book::isPhoneNumber
}

//4. 리시버 선택 혼동
class A {
    val a = 10
}

class B {
    val a = 20
    val b = 30

    fun A.test() = a + b // A.a? B.a?
}

/**
 * 멤버 확장함수보단 가시성 제한자를 붙여서 사용
 * */
private fun String.isPhoneNumber() = length == 7 && all { it.isDigit() }