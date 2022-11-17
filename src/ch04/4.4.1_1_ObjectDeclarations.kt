package ch04.ex4_1_1_ObjectDeclarations

import java.io.File

/**
 * Object 키워드: 클래스 선언과 인스턴스 생성. 싱글턴 쉽게 만들기
 * 객체 선언은 object 키워드로 시작
 * 객체 선언은 생성자를 선언할 수 없음!!
 */
object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }
}

fun main(args: Array<String>) {

    var a = listOf("a");


    println(CaseInsensitiveFileComparator.compare(File("/User"), File("/user")))
    val files = listOf(File("/Z"), File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))
}
