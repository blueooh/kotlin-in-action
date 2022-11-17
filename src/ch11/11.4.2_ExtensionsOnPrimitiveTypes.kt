package ch11.ex4_2_ExtensionsOnPrimitiveTypes

import java.time.LocalDate
import java.time.Period

val Int.days: Period
    get() = Period.ofDays(this) // this는 상수값(1)을 가리킨다

val String.days: Period
    get() = Period.ofDays(this.toInt()) // this는 상수값(1)을 가리킨다

val Period.ago: LocalDate
    get() = LocalDate.now() - this // 연산자 구문을 사용해 LocalDate.minus() 호출

val Period.fromNow: LocalDate
    get() = LocalDate.now() + this // 연산자 구문을 사용해 LocalDate.plus() 호출

fun main(args: Array<String>) {
    println(1.days)
    println(1.days.ago)
    println(1.days.fromNow)
    println("1".days.fromNow)
}
