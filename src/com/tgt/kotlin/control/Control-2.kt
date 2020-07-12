package com.tgt.kotlin.control

fun main() {

    println("------for loop-----")
    for ( i in 1..5) {
        println(i)
    }
    println("==============================")
    var list = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    for(element in list) {
        println(2 * element)
    }
    println("==============================")
    for (index in list.indices) {
        println(2 * list[index])
    }

    println("-----while-loop-------")

    var x = 10
    while(x <= 10) {
        println("Inside while loop x : $x")
        x++
    }
    println("==============================")
    var y =10
    do {
        y--
        println("Inside while loop y : $y")
    }while (y != 0)
}