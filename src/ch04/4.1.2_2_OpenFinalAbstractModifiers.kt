package ch04.ex1_2_2_OpenFinalAbstractModifiers

interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

open class RichButton : Clickable {
    // 오버라이드한 메소드를 하위에서 오버라이드하지 못하게 금지하려면 메소드 앞에 final 명시
    final override fun click() {}
}

//class Button : RichButton() {
//    override fun click() {
//        println("click!!")
//    }
//}