package ch09.ex2_1_1_GenericsAtRuntimeTypeChecksAndCasts

// 자바와 마찬가지로 코틀린 제네릭 타입 인자 정보는 런타임에 지워 진다.(타입 소거) 저장해야 하는 타입 정보의 크기가 줄어 메모리 사용량이 줄어드는 장점이 있다.
// 즉 컴파일 타임에는 타입 인자를 알 수 있지만, 런타임에는 하나의 컬렉션으로만 인지하때문에 원소를 검사하지 않는 이상 타입을 알 수 없다

// 위와 같은 이유로 타입 인자를 명시하지 않고 제네릭 타입을 사용할 수 없게 되기 때문에 이 경우, 스타 프로젝션을 사용한다
// 타입 파라미터가 2개 이상이라면 모튼 타입 파라미터에 *를 포함 시켜야한다


fun printSum(c: Collection<*>) { // ?
    val intList = c as? List<Int> // 이 부분에서 Unchecked cast: List<*> to List<Int> Warning 발생
            ?: throw IllegalArgumentException("List is expected")
    println(intList)
//    println(intList.sum())
}

fun printSum2(c: Collection<Any>) { // Object
    val intList = c as? List<Int> // 이 부분에서 Unchecked cast: List<*> to List<Int> Warning 발생
            ?: throw IllegalArgumentException("List is expected")
    println(intList)
//    println(intList.sum())
}

fun main(args: Array<String>) {
    printSum(listOf(1, 2, "A", 4, null))

//    printSum(setOf(1, 2, 3)) // java.lang.IllegalArgumentException: List is expected

//    printSum(listOf("1", "2", "3")) // java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Number
}
// ?