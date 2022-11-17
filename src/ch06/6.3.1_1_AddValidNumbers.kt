package ch06.AddValidNumbers

import java.util.ArrayList
import java.io.BufferedReader
import java.io.StringReader

// 6.3 컬렉션과 배열

fun readNumbers(reader: BufferedReader): List<Int?> {
    // 널이 될 수 있는 Int 값으로 이뤄진 리스트
    val result = ArrayList<Int?>()
    for (line in reader.lineSequence()) {
        try {
            val number = line.toInt()
            // 널이 아닌값 추가
            result.add(number)
        }
        catch(e: NumberFormatException) {
            // 널 추가
            result.add(null)
        }
    }
    return result
}

fun addValidNumbers(numbers: List<Int?>) {
    var sumOfValidNumbers = 0
    var invalidNumbers = 0
    // 널이 될 수 있는 값을 읽는다
    for (number in numbers) {
        // 널에 대한 값 확인 -> 이런 경우가 자주 있어서 다음 예제에서 확장 함수 제공
        if (number != null) {
            sumOfValidNumbers += number
        } else {
            invalidNumbers++
        }
    }
    println("Sum of valid numbers: $sumOfValidNumbers")
    println("Invalid numbers: $invalidNumbers")
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("1\nabc\n42"))
    val numbers = readNumbers(reader)
    addValidNumbers(numbers)
}
