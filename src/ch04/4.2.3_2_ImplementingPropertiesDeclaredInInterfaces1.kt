package ch04.ex2_3_2_ImplementingPropertiesDeclaredInInterfaces1

interface User {
    // 하위 클래스는 email 을 반드시 오버라이드 해야함
    val email: String
    // 매번 결과를 계산해서 반환
    val nickname: String
        get() = email.substringBefore('@')
}
