package ch04.ex2_4_AccessingABackingFieldFromAGetterOrSetter

/**
 * 게터와 세터에서 뒷받침하는 필드에 접근
 */
class User(val name: String) {
    // address 값을 변경하여 저장하기
    var address: String = "unspecified"
        set(value: String) {
            // field 라는 특별한 식별자를 통해 뒷받침하는 필드에 접근
            // 게터에서는 읽기만 가능. 세터에서는 읽기/쓰기 가능
            println("""
                Address was changed for $name:
                "$field" -> "$value".""".trimIndent())
            field = value
        }
}

fun main(args: Array<String>) {
    val user = User("Alice")
    user.address = "AAAA"
    println(user.address)

    user.address = "BBBB"
    println(user.address)
}
