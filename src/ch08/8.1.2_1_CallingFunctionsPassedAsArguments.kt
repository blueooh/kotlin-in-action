package ch08.ex1_2_1_CallingFunctionsPassedAsArguments

/**
 * 8.1.2 인자로 받은 함수 호출 : 간단한 고차 함수 정의하기
 */
fun twoAndThree(operation: (Int, Int) -> Int) { // 함수 타입인 파라미터를 선언
    val result = operation(2, 3) // 함수 타입인 파라미터를 호출
    println("The result is $result")
}

fun main(args: Array<String>) {
    /*
        함수타입은 파라미터와 반환값만 지정. 내부 로직은 호출하는 것에서 명시
        호출하는 곳에서 함수타입에 대한 로직을 선언하더라도, 실제 사용하는곳에서 실행해야만 동작

        ? 호출하는곳에서 로직은 선언한다면..... 이거 에러 추적이나 디버깅이 엄청 어려울것 같은데....
     */
    twoAndThree { a, b -> a + b }
    twoAndThree { a, b -> a * b }
}


