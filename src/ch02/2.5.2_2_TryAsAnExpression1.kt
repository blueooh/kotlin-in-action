package ch02.ex5_2_2_TryAsAnExpression1

import java.io.BufferedReader
import java.io.StringReader

// catch에서 값 반환하기

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }

    println(number)
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber(reader)
}
