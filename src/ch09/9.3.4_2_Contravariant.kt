package ch09.ex3_1_WhyVarianceExists

interface Cage<T> {
    fun get() : T
}

open class Animal {
    fun feed() {}
}

open class Hamster(var name: String) : Animal()

open class GoldenHamster(name: String) : Hamster(name)

open class GoldenHamster2(name: String) : GoldenHamster(name)

fun ancestorOfHamster(cage: Cage<in Hamster>) {
    println("조상 클래스 명 : ${cage.get().toString()}")
}

fun main(arge: Array<String>) {
    val animal = object : Cage<Animal> {
        override fun get(): Animal {
            return Animal()
        }
    }

    val hamster = object : Cage<Hamster> {
        override fun get(): Hamster {
            return Hamster("hamster")
        }
    }

    val goldenHamster = object : Cage<GoldenHamster> {
        override fun get(): GoldenHamster {
            return GoldenHamster("goldenHamster")
        }
    }

    ancestorOfHamster(animal)
    ancestorOfHamster(hamster)
//    ancestorOfHamster(goldenHamster) // compile error
}