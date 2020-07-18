package com.tgt.kotlin.collections

fun main() {
    val immutableSet = setOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    //Try adding element
    //immutableSet.add = 11;

    for (x in immutableSet) {
        println(x)
    }
    println("============================================")
    //Checking ordering
    val immutableSet2 = setOf<Int>(10, 9, 1, 2, 3, 4, 5, 6, 7, 8, 2)

    for (x in immutableSet2) {
        println(x)
    }
}