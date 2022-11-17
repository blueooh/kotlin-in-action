package ch09.ex2_2_1_DeclaringFunctionsWithReifiedTypeParameters

// 아래 코드는 실행 시점에 타입 인자 정보가 지워지기 때문에 컴파일 오류가 발생한다.
// fun <T> isAprime(value: Any) = value is T // Cannot check for instance of erased type: T

// 아래 코드는 inline 키워드를 통해 호출한 함수를 모두 함수 본문으로 바꾸게 되면서 인자 타입에 대해 알수있게되고, reified 를 통해 value 타입이 T의 인스턴스인지 알 수 있게 된다.
// Reified 키워드는 Generics로 inline function에서 사용되며, Runtime에 타입 정보를 알고 싶을 때 사용합니다. https://codechacha.com/ko/kotlin-reified-keyword/
inline fun <reified T> isA(value: Any) = value is T

fun main(args: Array<String>) {
    println(isA<String>("abc"))
    println(isA<String>(123))
}
