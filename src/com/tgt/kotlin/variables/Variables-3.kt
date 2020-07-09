package com.tgt.kotlin.variables

fun main() {
    var a = 5 //`Int` type is inferred
    a += 1
    println("a = $a")

    //Try re-assigning value
    a = 7
    println("a = $a")

}