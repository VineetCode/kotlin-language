package com.tgt.kotlin.collections

fun main() {
    val mutableSet = mutableSetOf<Int>(1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 4)

    //Try adding element
    mutableSet.add(10)

    for (x in mutableSet) {
        //prints unique elements only
        println(x)
    }
}