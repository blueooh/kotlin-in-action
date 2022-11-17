package ch06.ex2_6_NothingType

// 6.2.6 Nothing 타입: 이 함수는 결코 정상적으로 끝나지 않는다


// 성공적으로 값을 돌려주는 일이 없다
fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}

class Company(val address: String?, val city: String)

fun main(args: Array<String>) {
    val company = Company("1-1", "pangyo")
    val address = company.address ?: fail("No address")

    // company.address가 널인 경우 예외가 발생한다는 사실을 파악하고 address가 널이 아님을 추론
    println(address)
}
