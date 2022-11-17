package ch06.ex1_3_2_SafeCallOperator1

class Employee(val name: String, val manager: Employee?)

// 널이 될 수 있는 포로퍼티 안전하게 호출
fun managerName(employee: Employee): String? = employee.manager?.name

fun main(args: Array<String>) {
    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob Smith", ceo)
    println(managerName(developer))
    println(managerName(ceo))
}
