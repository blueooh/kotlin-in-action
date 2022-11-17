package ch06.ex1_3_3_SafeCallOperator2

class Address(val streetAddress: String, val zipCode: Int,
              val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun Person.countryName(): String {
    // 안전한 호출 연쇄시키기
    //val country = this.company?.address?.country
    // 불필요한 if문을 없앨 수 있다 -> 엘비스 연산자: ?:
    return this.company?.address?.country ?: "Unknown"
    //return if (country != null) country else "Unknown"
}

fun main(args: Array<String>) {
    val person = Person("Dmitry", null)
    println(person.countryName())
}
