package ch11.ex2_2_2_UsingLambdasWithReceiversInHTMLBuilders1

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
    fun tr(init: TR.() -> Unit) = doInit(TR(), init)
}
class TR : Tag("tr") {
    fun td(init: TD.() -> Unit) = doInit(TD(), init)
}
class TD : Tag("td")

fun createTable() =
    table {
        tr {
            td {
            }
        }
    }

fun createAnotherTable() = table {
    for (i in 1..2) {
        tr { // tr이 호출될 때마다 매번 새 TR 태그가 생기고, TABLE의 자식으로 등록된다.
            td {
            }
        }
    }
}

fun main(args: Array<String>) {
    println(createAnotherTable())
}
