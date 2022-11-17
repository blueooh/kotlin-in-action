package ch03.ex6_2_LocalFunctionsAndExtensions1

// 로컬 함수를 사용해 코드 중복 줄이기

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {

    // 로컬함수 정의
    fun validate(user: User,
                 value: String,
                 fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: empty $fieldName")
        }
    }

    // 로컬함수 호출
    validate(user, user.name, "Name")
    validate(user, user.address, "Address")

    // Save user to the database
}

fun main(args: Array<String>) {
    saveUser(User(1, "", ""))
}
