package ch04.ex4_2_2_CompanionObjects1

fun getFacebookName(accountId: Int) = "fb:$accountId"

class User private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) = User(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) = User(getFacebookName(accountId))
        fun newJustPrint () = User("kale").justPrint()
    }

    private fun justPrint() = println("Just Print: $nickname")
}

fun main(args: Array<String>) {
    val subscribingUser = User.newSubscribingUser("bob@gmail.com")
    println(subscribingUser.nickname)

    val facebookUser = User.newFacebookUser(4).nickname
    println(println(facebookUser))

    // 동반 객체는 자신을 둘러싼 클래스의 모든 private 멤버에 접근할 수 있음
    User.newJustPrint()
}
