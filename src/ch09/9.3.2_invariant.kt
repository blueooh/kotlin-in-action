package ch09.ex3_1_WhyVarianceExists

// Invariance, 무공변성
// Java, Kotlin 의 Generic 은 기본적으로 무공변성으로 아무런 설정이 없는 기본 Generic 을 말한다.



// 공변성 : out
// 반공변성 : in
fun sortGoldenHamster(cage: Cage<in GoldenHamster>) {
    val hamster = GoldenHamster("goldenHamster")
    print("정렬 : ${hamster.name}, ${cage.get()}") // Unresolved reference: name
}

fun main(args : Array<String>) {
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

    val goldenHamster2 = object : Cage<GoldenHamster2> {
        override fun get(): GoldenHamster2 {
            return GoldenHamster2("goldenHamster")
        }
    }

    sortGoldenHamster(animal) // compile error
    sortGoldenHamster(hamster) // compile error
    sortGoldenHamster(goldenHamster)
//    sortGoldenHamster(goldenHamster2)
}