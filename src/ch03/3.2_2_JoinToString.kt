package ch03.JoinToString

// 함수를 호출하기 쉽게 만들기

fun <T> joinToString(
        collection: Collection<T>,
        separator: String,
        prefix: String,
        postfix: String
): String {

    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    // 함수 호출 부분의 가독성을 개선하자
    println(joinToString(list, "; ", "(", ")"))
}

