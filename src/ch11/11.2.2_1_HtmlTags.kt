package ch11.HtmlTags

open class Tag(val name: String) {
    private val children = mutableListOf<Tag>()

    protected fun <T : Tag> doInit(child: T, init: T.() -> Unit) {
        child.init()
        children.add(child)
    }

    override fun toString() =
        "<$name>${children.joinToString("")}</$name>"
}

fun table(init: TABLE.() -> Unit) = TABLE().apply(init)

class TABLE : Tag("table") {
    fun tr(init: TR.() -> Unit) = doInit(TR(), init) // tr 함수는 TR 타입을 수신 객체로 받는 람다를 인자로 받는다.
}
class TR : Tag("tr") {
    fun td(init: TD.() -> Unit) = doInit(TD(), init) // td 함수는 TD 타입을 수신 객체로 받는 람다를 인자로 받는다.
}
class TD : Tag("td")

fun createTable() =
    table {
        tr {
            td {
            }
        }
    }

fun main(args: Array<String>) {
    println(createTable())
}
