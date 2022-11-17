package ch06.ex1_5_SafeCastsAs

// 6.1.5 안전한 캐스트: as?

class Person(val firstName: String, val lastName: String) {
   override fun equals(o: Any?): Boolean {
       // 지정한 타입(Person)으로 캐스트, 변환 할 수 없으면 null 반환
       // 엘비스 연산자를 같이 사용것이 일반적인 패턴
      val otherPerson = o as? Person ?: return false

      return otherPerson.firstName == firstName &&
             otherPerson.lastName == lastName
   }

   override fun hashCode(): Int =
      firstName.hashCode() * 37 + lastName.hashCode()
}

fun main(args: Array<String>) {
    val p1 = Person("Dmitry", "Jemerov")
    val p2 = Person("Dmitry", "Jemerov")
    println(p1 == p2)
    println(p1.equals(42))
}
