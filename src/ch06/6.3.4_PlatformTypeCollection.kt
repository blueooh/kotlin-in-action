package ch06.ex3_3_2_KotlinCollectionsAndJava1

import ch06.FileContentProcessor
import java.io.File

// 6.3.4 컬렉션을 플랫폼 타입으로 다루기

// 자바에서 선언한 컬렉션 타입의 변수를 코틀린에서는 플랫폼 타입으로 본다.(변경 가능성에 대해 알 수 없다.)
// 오버라이드하려는 메소드의 자바 컬렉션 타입을 어떤 코틀린 타입으로 표현할지 결정해야한다.
/*
- 컬렉션이 널이 될 수 있는가?
- 컬렉션의 원소가 널이 될 수 있는가?
- 오버라이드하는 메소드가 컬렉션을 변셩할 수 있는가?
 */

class FileIndexer: FileContentProcessor {
    override fun processContents(path: File,
                                 binaryContents: ByteArray?,
                                 textContests: List<String>?) {
        TODO("Not yet implemented")
    }
}
fun main(args: Array<String>) {
}