package ch05.ex2_4_2_FlatMapFlatten1

import ch03.ex1_1_CreatingCollectionsInKotlin.list

class Book(val title: String, val authors: List<String>)

fun main(args: Array<String>) {
    val books = listOf(Book("Thursday Next", listOf("Jasper Fforde")),
                       Book("Mort", listOf("Terry Pratchett")),
                       Book("Good Omens", listOf("Terry Pratchett",
                                                 "Neil Gaiman")))
    println(books.flatMap { it.authors })
    println(books.flatMap { it.authors }.toSet())
    println(books.map(Book::authors).flatten())

    val listOfLists = listOf(listOf("test1", "test1-2"), listOf("test3-1", "test3-2", listOf("test3-3", "test3-4")))
    println(listOfLists.flatten())

    val listOfLists2 = listOf(listOf("test1", "test1-2"), listOf("test3-1", "test3-2"), listOf("test3-3", "test3-4"))
    println(listOfLists2.flatten())
}
