package ch02.ex5_2_1_TryAsAnExpression

import java.io.BufferedReader
import java.io.StringReader

// 2.5.2 try를 식으로 사용

fun readNumber(reader: BufferedReader) {
    val number = try {
        // try식의 값
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }

    println(number)
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber(reader)
}
