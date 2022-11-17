package ch08.ex1_6_3_RemovingDuplicationThroughLambdas2

/**
 * 복잡하게 하드코딩한 필터를 사용해 방문 데이터 분석하기
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

val averageMobileDuration = log
    .filter { it.os in setOf(OS.IOS, OS.ANDROID) } // 여러 OS 에 대한 방문 정보 가져오기
    .map(SiteVisit::duration)
    .average()

fun main(args: Array<String>) {
    println(averageMobileDuration)
}
