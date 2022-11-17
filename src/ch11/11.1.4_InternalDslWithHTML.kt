package ch11.ex2_1_1_LambdasWithReceivers

import kotlinx.html.stream.createHTML
import kotlinx.html.table
import kotlinx.html.td
import kotlinx.html.tr

fun createLiner(): String {
    val line = StringBuilder()
    line.ensureCapacity(20)
    line.appendRange("=", 0, 20)
    return StringBuilder().apply {
        repeat(20) {
            append("=")
        }
    }.toString()


}

fun createSimpleTable() = createHTML().table {
    tr {
        td { +"cell" }
    }
}

fun createAnotherTable() = createHTML().table {
    val numbers = mapOf(1 to "one", 2 to "two")
    for ((num, string) in numbers) {
        tr {
            td { +"$num" }
            td { +string }
        }
    }
}

fun main(args: Array<String>) {
    println(createHTML().table {
        tr {
            td {

            }
            td {

            }
        }
    })

//    println(createSimpleTable())
//    println(createLiner())
//    println(createAnotherTable())
}