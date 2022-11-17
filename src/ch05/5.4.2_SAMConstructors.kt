package ch05.ex4_2_SAMConstructors

import ch05.Button
import ch05.OnClickListener

// SAM(Single Abstract Interface) Interface 단일 추상 인터페이스
fun samMethod() {
    Button.setSam(Button.SAMInterface { println() })
    Button.setSam({ println() })
    Button.setSam { println("") }
}

//fun createSamInterface(): OnClickListener {
//    return OnClickListener { println("test") }
//}

fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}

fun main(args: Array<String>) {
    createAllDoneRunnable().run()
}
