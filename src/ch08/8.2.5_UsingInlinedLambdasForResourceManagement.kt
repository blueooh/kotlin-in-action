package ch08.ex2_5_UsingInlinedLambdasForResourceManagement

import java.io.BufferedReader
import java.io.FileReader

/**
 * 8.2.5 자원 관리를 위해 인라인된 람다 사용
 * - 코틀린에서는 자바의 try-with-resource 와 같은 기능을 제공하는 use 함수 제공
 */
fun readFirstLineFromFile(path: String): String {
    BufferedReader(FileReader(path)).use { br ->
        return br.readLine()
    }
}

/*
public void readFirstLineFromFile() {
    try(BufferedReader br = new BufferedReader(new FileReader(path))) {
        return br.readLine();
    }
}
*/
