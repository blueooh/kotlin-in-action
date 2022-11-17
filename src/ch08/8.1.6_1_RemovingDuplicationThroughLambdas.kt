package ch08.ex1_6_1_RemovingDuplicationThroughLambdas

/**
 * 8.1.6 람다를 활용한 중복 제거
 * - 사이트 방문 데이터 정의
 */
data class SiteVisit(
    val path: String,
    val duration: Double,
    val os: OS
)

enum class OS { WINDOWS, LINUX, MAC, IOS, ANDROID }

val log = listOf(
    SiteVisit("/", 34.0, OS.WINDOWS),
    SiteVisit("/", 22.0, OS.MAC),
    SiteVisit("/login", 12.0, OS.WINDOWS),
    SiteVisit("/signup", 8.0, OS.IOS),
    SiteVisit("/", 16.3, OS.ANDROID)
)

// Window 사용자에 대한 평균 값
val averageWindowsDuration = log
    .filter { it.os == OS.WINDOWS }
    .map(SiteVisit::duration)
    .average()

fun main(args: Array<String>) {
    println(averageWindowsDuration)
}
