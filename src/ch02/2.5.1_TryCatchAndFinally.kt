package ch02.ex5_1_TryCatchAndFinally

// 2.5 코틀린의 예외처리

import java.io.BufferedReader
import java.io.StringReader

// 처리하지 않은 예외를 명시할 필요가 없다.
fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }
    // 예외 타입
    catch (e: NumberFormatException) {
        return null
    }
    finally {
        reader.close()
    }
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))
}
