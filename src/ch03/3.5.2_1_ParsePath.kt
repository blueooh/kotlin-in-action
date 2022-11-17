package ch03.ParsePath

// string 확장함수를 사용해 경로 파싱하기
// 정규표현식을 사용하지 않고 쉽게 파싱 -> 정규식은 나중에 알오보기 힘들수 있음
fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("Dir: $directory, name: $fileName, ext: $extension")
}

fun main(args: Array<String>) {
    parsePath("/Users/yole/kotlin-book/chapter.adoc")
}
