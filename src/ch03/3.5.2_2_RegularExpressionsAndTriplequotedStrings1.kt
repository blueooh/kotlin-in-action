package ch03.ex5_2_2_RegularExpressionsAndTriplequotedStrings1

// 경로 파싱에 정규식 사용하기

fun parsePath(path: String) {
    // 삼중따옴표에서 escape는 \하나만 사용한다.
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}

fun main(args: Array<String>) {
    parsePath("/Users/yole/kotlin-book/chapter.adoc")
}
