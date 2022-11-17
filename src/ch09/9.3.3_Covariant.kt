package ch09.ex3_1_WhyVarianceExists

// 공변성 : 하위 타입 관계를 유지, Producer<T>를 예로 A가 B의 하위 타입 일때, Producer<A>가 Producer<B>의 하위 타입이면 Producer 공변적이라 하고,
// 하위 타입 관계가 유지 된다고 한다. 코틀린에서 제네릭 클래스가 타입 파라미터에 대해 공변적임을 표시 하려면 타입 파라미터 이름 앞에 out을 넣어 주어야 한다.

interface Producer<out T> { // 클래스가 T에 대해 공변적이라고 선언한다.
    fun produce() : T
}



class Dog : Animal()

class Herd<out T : Animal> { // 이 타입 파라미터(T)를 무공변성(in, out 등의 키워드 미사용)으로 지정한다
    val size : Int get() = 0
//    operator fun get(i: Int) : T { return  }
}

fun feedAll(animals: Herd<Animal>) {
    for (i in 0 until animals.size) {
    }
}

class Cat : Animal() {
    fun cleanLitter() {}
}

fun takeCareOfCats(cats: Herd<Cat>) {
    for (i in 0 until cats.size) {
//        cats[i].cleanLitter()
    }
    feedAll (cats) // error: inferred type is Herd<Cat>, but Herd<Animal> was expected 오류 발생
}

// 공변성을 부여 하게 되면 feedAll(cats) 호출이 가능하게 된다.
// 하지만 공변적으로 만들면 안전하지 못한 클래스도 있기 때문에, 모든 클래스를 공변적으로 바꿀 순 없다.
// 결국 out 을 넣어주면 공변적이기 때문에 해당 클래스가 T 타입의 값을 생산할 수는 있지만, T 타입의 값을 소비할 수는 없다.