package ch04.ex2_1_InitializingClasses

class User(val nickname: String,
           val isSubscribed: Boolean = true)
/**
 * 클래스 초기화 : 주 생성자와 초기화 블럭
 */
fun main(args: Array<String>) {
    // isSubscribed 는 기본값 사용
    val alice = User("Alice")
    println(alice.isSubscribed)

    // 모든 인자를 파라미터로 선언한 경우
    val bob = User("Bob", false)
    println(bob.isSubscribed)

    // 생성자 인자 중 일부에 대해 이름을 지정할 수 있음
    val carol = User("Carol", isSubscribed = false)
    println(carol.isSubscribed)
}
