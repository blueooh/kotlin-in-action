package ch04.ex3_1_2_1_ObjectEqualityEquals

class Client(val name: String, val postalCode: Int) {
    override fun hashCode(): Int {
        return 1
    }
}

fun main(args: Array<String>) {
    val client1 = Client("Alice", 342562)
    val client2 = Client("Alice", 342562)

    // 코틀린에서 == 연산자는 참조 동일성을 검사하지 않고 객체의 동등성을 검사.
    // 따라서 == 연산은 equals 를 호출하는 식으로 컴파일 됨
    println(client1 == client2)
}