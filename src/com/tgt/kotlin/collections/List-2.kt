package com.tgt.kotlin.collections

fun main() {

    val mutableList = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 8)

    //Try adding elements
    mutableList.add(10)

    //Modify elements
    mutableList[8] = 9

    for (x in mutableList) {
        println(x)
    }
    println("=======================================================")

    mutableList.forEachIndexed {
            index, element -> println("2 x ${index+1}   = ${element * 2}")
    }
}