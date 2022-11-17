package ch09.ex3_1_WhyVarianceExists

fun tamingHamster(cage: Cage<out Hamster>) {
    println("햄스터 이름 : ${cage.get().name}")
}

fun main(args: Array<String>) {

    val animal = object : Cage<Animal> {
        override fun get(): Animal {
            return Animal()
        }
    }

    val hamster = object : Cage<Hamster> {
        override fun get(): Hamster {
            return Hamster("Hamster")
        }
    }

    val goldenHamster = object : Cage<GoldenHamster> {
        override fun get() : GoldenHamster {
            return GoldenHamster("GoldenHamster")
        }
    }

//    tamingHamster(animal) // compile error
    tamingHamster(hamster)
    tamingHamster(goldenHamster)
}