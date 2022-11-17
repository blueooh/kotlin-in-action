package ch03.ex1_1_CreatingCollectionsInKotlin


val set = hashSetOf(1, 7, 53)
val list = arrayListOf(1, 7, 53)
// to는 키워드가 아닌 일반함수 -> 중위호출(infix call)
// to 선언부를 확인해보자
val map = hashMapOf(1.to("one"), 7 to "seven", 53 to "fifty-three")

// 중위함수 만들어보기
infix fun <E> List<E>.g(i: Int): E = this.get(i)

fun main(args: Array<String>) {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    println(list g 0)
}

/** 코틀린 컬렉션은 자바 컬렉션과 동일한 클래스 = 상호 호환성에 좋다 */