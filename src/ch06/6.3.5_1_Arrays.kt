package ch06.ex3_5_1_Arrays

// 6.3.5 객체의 배열과 원시 타입의 배열

fun main(args: Array<String>) {
    // 배열 이터레이션 확장함수
    for (i in args.indices) {
        // 인덱스를 사용해 배열 원소 접근
         println("Argument $i is: ${args[i]}")
    }
}
