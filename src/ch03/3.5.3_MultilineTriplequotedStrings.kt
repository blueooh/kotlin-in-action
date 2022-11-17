package ch03.ex5_3_MultilineTriplequotedStrings

// 여러 줄 3중 따옴표 문자열

// 줄바꿈이 문자열 그대로 적용된다
// / 슬러시를 escape처리할 필요 없다
// 문자 $를 넣어야한다면 '$'넣어야 한다
val kotlinLogo = """| //
                   .|//
                   .|/ \"""

fun main(args: Array<String>) {
    println(kotlinLogo.trimMargin("."))
}
