package ch09.FieldValidator

import kotlin.reflect.KClass

interface FieldValidator<in T> { // 사용자 입력 검증용 인터페이스(T 는 반공변인 타입인자)
    fun validate(input: T): Boolean
}

object DefaultStringValidator : FieldValidator<String> {
    override fun validate(input: String) = input.isNotEmpty()
}

object DefaultIntValidator : FieldValidator<Int> {
    override fun validate(input: Int) = input >= 0
}

fun main(args: Array<String>) {
    val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()
    validators[String::class] = DefaultStringValidator
    validators[Int::class] = DefaultIntValidator

//    validators[String::class]!!.validate("test") // compile error, 컴파일러는 FieldValidator<*>가 어떤 타입인지 알 수 없다

    // 아래와 같이 명시적으로 캐스팅을 하면 사용은 가능하지만, casting 경고가 출력 된다
    // 또한 검증기를 잘못 가져온 경우 예외가 발생하는데, 이러한 경우 런타임에서만 발견이 가능하다
    val stringValidator = validators[String::class] as FieldValidator<String> // Unchecked cast: FieldValidator<*>? to FieldValidator<String>
    println(stringValidator!!.validate("test"))
}
