package ch08.ex1_5_2_ReturningFunctionsFromFunctions1

/**
 * 함수를 반환하는 함수를 UI 코드에서 사용하기
 * 조건 :
 * - GUI 연락처 관리 앱을 만드는 데 UI 의 상태에 따라 어떤 연락처 정보를 표시할지 결정
 * - 사용자가 UI 의 입력 창에 입력한 문자열과 매치되는 연락처만 표시
 * - 전화번호 정보가 없는 연락처를 제외
 */
data class Person(
        val firstName: String,
        val lastName: String,
        val phoneNumber: String?
)

class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false

    fun getPredicate(): (Person) -> Boolean { // 함수를 반환하는 함수를 정의
        val startsWithPrefix = { p: Person ->
            p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)
        }

        if (!onlyWithPhoneNumber) {
            return startsWithPrefix // 함수 타입의 변수를 반환
        }

        return {
            startsWithPrefix(it) && it.phoneNumber != null // 람다를 반환
        }
    }
}

fun main(args: Array<String>) {
    val contacts = listOf(Person("Dmitry", "Jemerov", "123-4567"), Person("Svetlana", "Isakova", null))
    val contactListFilters = ContactListFilters()
    with(contactListFilters) {
        prefix = "Dm"
        onlyWithPhoneNumber = true
    }

    // getPredicate 가 반환한 함수를 filter 에게 인자로 넘김
    println(contacts.filter(contactListFilters.getPredicate()))
}
