package ch08.ex1_5_1_ReturningFunctionsFromFunctions

/**
 * 8.1.5 함수를 함수에서 반환
 * - 조건에 따라 달라질 수 있는 로직의 경우에 유용
 */
enum class Delivery { STANDARD, EXPEDITED }

class Order(val itemCount: Int)

fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double { // 함수를 반환하는 함수를 선언
    if (delivery == Delivery.EXPEDITED) {
        return { order -> 6 + 2.1 * order.itemCount } // 함수에서 EXPEDITED 에 대한 람다를 반환
    }

    return { order -> 1.2 * order.itemCount } // 함수에서 EXPEDITED 이외의 경우에 대한 람다를 반환
}

fun main(args: Array<String>) {
    val calculator = getShippingCostCalculator(Delivery.EXPEDITED) // 반환받은 함수를 변수에 저장
    println("Shipping costs ${calculator(Order(3))}") // 반환받은 함수를 호출
}
