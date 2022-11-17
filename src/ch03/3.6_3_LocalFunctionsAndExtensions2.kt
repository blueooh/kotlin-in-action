package ch03.ex6_3_LocalFunctionsAndExtensions2

// 로컬 함수에서 바깥 함수의 파라미터 접근하기

class User(val id: Int, val name: String, val address: String)

fun saveUser(user: User) {

    // User 파리미터 중복 사용하지 않음
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException(
                "Can't save user ${user.id}: " + // 바깥 함수의 파라미터에 직접 접근
                    "empty $fieldName")
        }
    }

    validate(user.name, "Name")
    validate(user.address, "Address")

    // Save user to the database
}

fun main(args: Array<String>) {
    saveUser(User(1, "", ""))
}
