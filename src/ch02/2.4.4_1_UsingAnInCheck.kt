package ch02.ex4_4_1_UsingAnInCheck

// in으로 컬렉션이나 범위의 원소 검사

// c in 'a'..'z' 는 'a' <= c && c <= 'z'로 변환
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun main(args: Array<String>) {
    println(isLetter('q'))
    println(isNotDigit('x'))
}
