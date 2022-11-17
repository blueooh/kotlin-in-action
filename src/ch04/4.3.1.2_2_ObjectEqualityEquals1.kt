package ch04.ex3_1_2_2_ObjectEqualityEquals1

class Client(val name: String, val postalCode: Int) {
    // "Any" 는 자바의 Object 에 대응하는 클래스로 코틀린의 최상위 클래스이다.
    // equals 를 새롭게 구현
    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)
            return false

        // 두 객체의 프로퍼티 값이 동일한지 검사
        return name == other.name &&
               postalCode == other.postalCode
    }
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"
}

fun main(args: Array<String>) {
    val client1 = Client("Alice", 342562)
    val client2 = Client("Alice", 342562)
    // 두 객체가 같다는 결과를 반환
    println(client1 == client2)
}
