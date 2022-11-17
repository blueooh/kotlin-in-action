package ch04.ex3_2_1_DataClassCopy

/**
 * 데이터 클래스: 모든 클래스가 정의해야 하는 메소드 자동 생성(toString, equals, hashCode)
 * data 라는 변경자를 클래스 앞에 붙이면 필요한 메소드를 컴파일러가 자동으로 생성
 * data 변경자가 붙은 클래스를 데이터 클래스라고 함
 */
data class Client(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val bob = Client("Bob", 973293)
    val bob2 = Client("Bob", 973293)

    println(bob.hashCode())
    println(bob2.hashCode())
    println(bob == bob2)
//    println(bob.copy(postalCode = 382555))
}
