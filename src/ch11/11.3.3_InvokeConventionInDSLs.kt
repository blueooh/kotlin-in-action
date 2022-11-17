package ch11.ex3_3_InvokeConventionInDSLs

class DependencyHandler {
    fun compile(coordinate: String) { // 일반적인 메서드 선언으로 API 정의
        println("Added dependency on $coordinate")
    }

    operator fun invoke( // invoke를 통해 DSL 스타일로 API 정의
            body: DependencyHandler.() -> Unit) {
        body()
    }
}

fun main(args: Array<String>) {
    val dependencies = DependencyHandler()
    dependencies.compile("org.jetbrains.kotlin:kotlin-stdlib:1.0.0")
    dependencies {
        compile("org.jetbrains.kotlin:kotlin-reflect:1.0.0")
    }
}
