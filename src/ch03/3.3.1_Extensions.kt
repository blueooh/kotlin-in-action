package strings

/** 확장함수 = 수신객체타입.fun() */

fun String.lastChar(): Char = this.get(this.length - 1)

fun main(args: Array<String>) {
    println("Kotlin".lastChar())

    // Java
    // getter나 setter를 명시적으로 호출
    // StringUtilKt.getLastChar("Java")
}
