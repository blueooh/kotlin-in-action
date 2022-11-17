package ch06.ex2_2_NullablePrimitiveTypes

// 6.2.2 널이 될 수 있는 원시 타입: Int?, Boolean?등

// 코틀린 널이 될 수 있는 타입 -> 자바의 래퍼 타입

// age -> java.lang.Integer
data class Person(val name: String,
                  val age: Int? = null) {

    fun isOlderThan(other: Person): Boolean? {
        // 널검사를 해야한다.
        if (age == null || other.age == null)
            return null
        return age > other.age
    }
}

fun main(args: Array<String>) {
    println(Person("Sam", 35).isOlderThan(Person("Amy", 42)))
    println(Person("Sam", 35).isOlderThan(Person("Jane")))
}
