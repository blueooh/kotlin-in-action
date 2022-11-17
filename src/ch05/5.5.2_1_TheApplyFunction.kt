package ch05.ex5_2_1_TheApplyFunction

class Person(val name: String, val age: Int)

fun alphabet() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()

fun getPerson() = Person("test", 10).apply {
    return this
}

fun main(args: Array<String>) {
    println(alphabet())
    println(getPerson())
}
